package com.stepinformatica.f1.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.stepinformatica.f1.entities.Pilot;
import com.stepinformatica.f1.entities.Team;

public class TeamDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String imgUrl;
	private String siteUrl;
	
	private List<PilotDTO> pilots = new ArrayList<>();
	
	public TeamDTO() {
	}

	public TeamDTO(Long id, String name, String imgUrl, String siteUrl) {
		this.id = id;
		this.name = name;
		this.imgUrl = imgUrl;
		this.siteUrl = siteUrl;
	}
	
	public TeamDTO(Team entity) {
		id = entity.getId();
		name = entity.getName();
		imgUrl = entity.getImgUrl();
		siteUrl = entity.getSiteUrl();
	}

	public TeamDTO(Team entity, Set<Pilot> pilots) {
		this(entity);
		pilots.forEach(cat -> this.pilots.add(new PilotDTO(cat)));
	}	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getSiteUrl() {
		return siteUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<PilotDTO> getPilots() {
		return pilots;
	}


}
