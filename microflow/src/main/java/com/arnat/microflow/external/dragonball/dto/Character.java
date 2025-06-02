package com.arnat.microflow.external.dragonball.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Character extends Item{

	private String ki;
	private String maxKi;
	private String race;
	private String gender;
	private String affiliation;
}
