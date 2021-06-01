package com.stepinformatica.f1.servicies;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stepinformatica.f1.dto.PilotDTO;
import com.stepinformatica.f1.dto.TeamDTO;
import com.stepinformatica.f1.entities.Pilot;
import com.stepinformatica.f1.entities.Team;
import com.stepinformatica.f1.repositories.PilotRepository;
import com.stepinformatica.f1.repositories.TeamRepository;
import com.stepinformatica.f1.servicies.exceptions.DatabaseException;
import com.stepinformatica.f1.servicies.exceptions.ResourceNotFoundException;

@Service
public class TeamService {

	@Autowired
	private TeamRepository repository;

	@Autowired
	private PilotRepository pilotRepository;

	@Transactional(readOnly = true)
	public Page<TeamDTO> findAllPaged(PageRequest pageRequest) {
		Page<Team> list = repository.findAll(pageRequest);
		return list.map(x -> new TeamDTO(x));
	}

	@Transactional(readOnly = true)
	public TeamDTO findById(Long id) {
		Optional<Team> obj = repository.findById(id);
		Team entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new TeamDTO(entity, entity.getPilots());
	}

	@Transactional
	public TeamDTO insert(TeamDTO dto) {
		Team entity = new Team();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new TeamDTO(entity);
	}

	@Transactional
	public TeamDTO update(Long id, TeamDTO dto) {
		try {
			Team entity = repository.getOne(id);
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new TeamDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}
	}

	private void copyDtoToEntity(TeamDTO dto, Team entity) {
		entity.setName(dto.getName());
		entity.setImgUrl(dto.getImgUrl());
		entity.setSiteUrl(dto.getSiteUrl());
		entity.setImgUrl(dto.getImgUrl());
		entity.getPilots().clear();
		// entity.getPilots().

		// dto.get

		// entity.getCategories().clear();
		for (PilotDTO catDto : dto.getPilots()) {
			Pilot p = pilotRepository.getOne(catDto.getId());
			entity.getPilots().add(p);
		}
	}
}
