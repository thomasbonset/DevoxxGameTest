package com.valtech.devoxx.tddgame.wecodeinpeace.model;

import java.util.List;

public class SpaceShip {
	public List<Javaltechian> getPopulation() {
		return population;
	}

	public void setPopulation(List<Javaltechian> population) {
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private List<Javaltechian> population;
	private String name;
	
	public SpaceShip(String name) {
		this.name = name;
	}
}
