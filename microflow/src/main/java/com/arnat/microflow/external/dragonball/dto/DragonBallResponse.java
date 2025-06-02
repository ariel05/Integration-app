package com.arnat.microflow.external.dragonball.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DragonBallResponse {

	private List<Item> items;
	private Meta meta;
	private Link links;
}