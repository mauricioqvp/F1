package com.stepinformatica.f1.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.stepinformatica.f1.entities.Pilot;

public class PilotDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String firstName;
	private String surName;
	private Instant birthDate;
	private String foto;
	private int victories;
	private int victoriesInYear;
	private String webSite;
	private String country;
	
	private List<TeamDTO> teams = new ArrayList<>();
	
	public PilotDTO() {
		super();
	}
	
	public PilotDTO(Long id, String firstName, String surName, Instant birthDate, String foto, int victories,
			int victoriesInYear, String webSite, String country) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surName = surName;
		this.birthDate = birthDate;
		this.foto = foto;
		this.victories = victories;
		this.victoriesInYear = victoriesInYear;
		this.webSite = webSite;
		this.country = country;
	}

	public PilotDTO(Pilot entity) {
		this.id = entity.getId();
		this.firstName = entity.getFirstName();
		this.surName = entity.getSurName();
		this.birthDate = entity.getBirthDate();
		this.foto = entity.getFoto();
		this.victories = entity.getVictories();
		this.victoriesInYear = entity.getVictoriesInYear();
		this.webSite = entity.getWebSite();
		this.country = entity.getCountry();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getVictories() {
		return victories;
	}

	public void setVictories(int victories) {
		this.victories = victories;
	}

	public int getVictoriesInYear() {
		return victoriesInYear;
	}

	public void setVictoriesInYear(int victoriesInYear) {
		this.victoriesInYear = victoriesInYear;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<TeamDTO> getTeams() {
		return teams;
	}


}
