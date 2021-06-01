package com.stepinformatica.f1.servicies;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stepinformatica.f1.dto.PilotDTO;
import com.stepinformatica.f1.entities.Pilot;
import com.stepinformatica.f1.repositories.PilotRepository;
import com.stepinformatica.f1.servicies.exceptions.ResourceNotFoundException;

@Service
public class PilotService {
	
	@Autowired
	private PilotRepository repository;
	
	@Transactional
	public PilotDTO insert(PilotDTO dto) {
		Pilot entity = new Pilot();
		entity.setFirstName(dto.getFirstName());
		entity.setSurName(dto.getSurName());
		entity.setBirthDate(dto.getBirthDate());
		entity.setFoto(dto.getFoto());
		entity.setVictories(dto.getVictories());
		entity.setVictoriesInYear(dto.getVictoriesInYear());
		entity.setWebSite(dto.getWebSite());
		entity.setCountry(dto.getCountry());
		entity = repository.save(entity);
		
		return new PilotDTO(entity);
	}

	public PilotDTO findById(Long id) {
		Optional<Pilot> obj = repository.findById(id);
		Pilot entity = obj.orElseThrow(() -> new ResourceNotFoundException("Id não encontrado " + id));
		return new PilotDTO(entity);
	}
	
	public List<PilotDTO> findAll() {
		List<Pilot> list = new ArrayList<>();
		list = repository.findAll();
		return list.stream().map(x -> new PilotDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public Page<PilotDTO> findAllPaged(PageRequest pageRequest) {
		Page<Pilot> list = repository.findAll(pageRequest);
		return list.map(x -> new PilotDTO(x));
	}
}
