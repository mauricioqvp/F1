package com.stepinformatica.f1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stepinformatica.f1.entities.Team;

public interface TeamRepository extends JpaRepository<Team, Long>{

}
