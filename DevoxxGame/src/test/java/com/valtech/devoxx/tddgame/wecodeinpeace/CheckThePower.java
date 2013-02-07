package com.valtech.devoxx.tddgame.wecodeinpeace;

import com.valtech.devoxx.tddgame.wecodeinpeace.service.JavaltechianService;

public class CheckThePower {

	private JavaltechianService service = new JavaltechianService();
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPowerByName(){
	
		return service.givePowerByName(name);
	}
	
	public int getAgeByName(){
		return service.giveAgeByName(name);
	}
	
	public int getNumberOfEyesByName(){
		return service.giveNumberOfEyesByName(name);
	}
}
