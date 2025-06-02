package com.arnat.microflow.external.digimon.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DigimonResponse {

	private Integer id;
	private String name;
	private Boolean xAntibody;
	private List<Image> images;
	private List<Level> levels;
	private List<Type> types;
	private List<Attribute> attributes;
	private List<Field> fields;
	private String releaseDate;
	private List<Description> descriptions;
	private List<Skill> skills;
	private List<Evolution> priorEvolutions;
	private List<Evolution> nextEvolutions;
	
}
