package com.valtech.devoxx.tddgame.wecodeinpeace;

import com.valtech.devoxx.tddgame.wecodeinpeace.model.Javaltechian;

public class CreateJavaltechian {
	private String name;
	private int power;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	public Javaltechian create() {
		return new Javaltechian(name, power);
	}
}
