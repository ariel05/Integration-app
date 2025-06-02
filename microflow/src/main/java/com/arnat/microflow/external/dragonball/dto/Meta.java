package com.arnat.microflow.external.dragonball.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Meta {

	private Integer totalItems;
	private Integer itemCount;
	private Integer itemsPerPage;
	private Integer totalPages;
	private Integer currentPage;
}
