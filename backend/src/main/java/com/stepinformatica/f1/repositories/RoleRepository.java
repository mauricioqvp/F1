package com.stepinformatica.f1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stepinformatica.f1.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
