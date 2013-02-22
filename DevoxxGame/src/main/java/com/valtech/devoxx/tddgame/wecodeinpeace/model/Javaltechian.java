package com.valtech.devoxx.tddgame.wecodeinpeace.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
 public @Data class Javaltechian {
	@NonNull private String name;
	@NonNull private String forename;
	private int power;
	private int age;
}
