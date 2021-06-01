package com.stepinformatica.f1.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pilot")
public class Pilot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstName;
	private String surName;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant birthDate;

	private String foto;
	private int victories;
	private int victoriesInYear;
	private String webSite;
	private String country;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_team_pilot", 
			joinColumns = @JoinColumn(name = "pilot_id"),
			inverseJoinColumns = @JoinColumn(name = "team_id"))
	private Set<Team> teams = new HashSet<>();

	public Pilot() {
		super();
	}

	public Pilot(Long id, String firstName, String surName, Instant birthDate, String foto, int victories,
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pilot other = (Pilot) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Set<Team> getTeams() {
		return teams;
	}
}