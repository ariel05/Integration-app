package com.arnat.microflow.external.dragonball.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
	private Integer id;
	private String name;
	private String image;
	private String description;
	private String deletedAt;
}
