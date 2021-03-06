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

import com.stepinformatica.f1.dto.RoleDTO;
import com.stepinformatica.f1.dto.UserDTO;
import com.stepinformatica.f1.dto.UserInsertDTO;
import com.stepinformatica.f1.dto.UserUpdateDTO;
import com.stepinformatica.f1.entities.Role;
import com.stepinformatica.f1.entities.User;
import com.stepinformatica.f1.repositories.RoleRepository;
import com.stepinformatica.f1.repositories.UserRepository;
import com.stepinformatica.f1.servicies.exceptions.DatabaseException;
import com.stepinformatica.f1.servicies.exceptions.ResourceNotFoundException;

@Service
public class UserService /* implements UserDetailsService */{

	//private static Logger logger = LoggerFactory.getLogger(UserService.class);

	/*
	 * @Autowired private BCryptPasswordEncoder passwordEncoder;
	 */

	@Autowired
	private UserRepository repository;

	@Autowired
	private RoleRepository roleRepository;

	@Transactional(readOnly = true)
	public Page<UserDTO> findAllPaged(PageRequest pageRequest) {
		Page<User> list = repository.findAll(pageRequest);
		return list.map(x -> new UserDTO(x));
	}

	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		Optional<User> obj = repository.findById(id);
		User entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new UserDTO(entity);
	}

	@Transactional
	public UserDTO insert(UserInsertDTO dto) {
		User entity = new User();
		copyDtoToEntity(dto, entity);

		// Fiz uma mudança GRANDE aqui!!!
		// entity.setPassword(passwordEncoder.encode(dto.getPassword()));
		entity = repository.save(entity);
		return new UserDTO(entity);
	}

	@Transactional
	public UserDTO update(Long id, UserUpdateDTO dto) {
		try {
			@SuppressWarnings("deprecation")
			User entity = repository.getOne(id);
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new UserDTO(entity);
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

	private void copyDtoToEntity(UserDTO dto, User entity) {
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setEmail(dto.getEmail());

		entity.getRoles().clear();
		for (RoleDTO roleDto : dto.getRoles()) {
			@SuppressWarnings("deprecation")
			Role role = roleRepository.getOne(roleDto.getId());
			entity.getRoles().add(role);
		}
	}

	/*
	 * @Override public UserDetails loadUserByUsername(String username) throws
	 * UsernameNotFoundException {
	 * 
	 * User user = repository.findByEmail(username); if (user == null) {
	 * logger.error("User not found:" + username); throw new
	 * UsernameNotFoundException("Email not found"); } logger.info("User found: " +
	 * username); return user; }
	 */

}
