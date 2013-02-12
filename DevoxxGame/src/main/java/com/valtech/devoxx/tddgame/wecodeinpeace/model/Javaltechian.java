package com.valtech.devoxx.tddgame.wecodeinpeace.model;

public class Javaltechian {
	
	private String name;
	private int power;
	private String forename;
	private String age;
	
	public Javaltechian(String name, int power, String forename, String age) {
		super();
		this.name = name;
		this.power = power;
		this.forename = forename;
		this.age = age;
	}
	
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
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

}
