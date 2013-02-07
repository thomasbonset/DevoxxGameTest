package com.valtech.devoxx.tddgame.wecodeinpeace;

import com.valtech.devoxx.tddgame.wecodeinpeace.service.InvasionService;
import com.valtech.devoxx.tddgame.wecodeinpeace.service.ShipService;

public class CheckTheCapacity {
	
	private ShipService service = new ShipService();
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getCapacity(){
		return service.getMaxCapacityByName(name);
	}
	
}
