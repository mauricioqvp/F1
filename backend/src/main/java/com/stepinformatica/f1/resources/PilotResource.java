package com.stepinformatica.f1.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.stepinformatica.f1.dto.PilotDTO;
import com.stepinformatica.f1.servicies.PilotService;

@RestController
@RequestMapping(value = "/pilot")
public class PilotResource {
	
	/*
	 * CRUD - Creat, Retrive (2x), Update, Delete
	 */
	
	@Autowired
	private PilotService service;
	
	@PostMapping
	public ResponseEntity<PilotDTO> insert(@RequestBody PilotDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<PilotDTO> findById(@PathVariable Long id) {
		PilotDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<PilotDTO>> findAll() {
	List<PilotDTO> list = service.findAll();
	return ResponseEntity.ok().body(list);
	}
	
	@GetMapping
	public ResponseEntity<Page<PilotDTO>> findAllPaged(@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction,
			@RequestParam(value = "orderBy", defaultValue = "name") String orderBy) {

		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);

		Page<PilotDTO> list = service.findAllPaged(pageRequest);
		return ResponseEntity.ok().body(list);
	}
	
	public void upDate() {
		
	}
	
	public void delete() {
		
	}
}
