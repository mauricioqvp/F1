package com.stepinformatica.f1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stepinformatica.f1.entities.Pilot;

@Repository
public interface PilotRepository extends JpaRepository<Pilot, Long>{

}
