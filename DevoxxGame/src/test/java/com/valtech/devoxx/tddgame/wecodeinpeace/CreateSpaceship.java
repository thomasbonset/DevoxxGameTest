package com.valtech.devoxx.tddgame.wecodeinpeace;

import com.valtech.devoxx.tddgame.wecodeinpeace.model.Javaltechian;
import com.valtech.devoxx.tddgame.wecodeinpeace.model.SpaceShip;

public class CreateSpaceship {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public SpaceShip create() {
		return new SpaceShip(name);
	}
	
}
