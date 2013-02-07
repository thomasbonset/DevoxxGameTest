package com.valtech.devoxx.tddgame.wecodeinpeace.model;

public class Javaltechian {
	private String name;
	private int power;
	private enum Choix {pierre, feuille, ciseaux}; 
	

	
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
	
	public Javaltechian(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}


}
