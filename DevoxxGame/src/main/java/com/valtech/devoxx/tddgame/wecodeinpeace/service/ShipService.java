package com.valtech.devoxx.tddgame.wecodeinpeace.service;

import com.valtech.devoxx.tddgame.wecodeinpeace.model.Javaltechian;
import com.valtech.devoxx.tddgame.wecodeinpeace.model.SpaceShip;

public class ShipService {

	
	 public SpaceShip addAJavaltechian(SpaceShip spaceShip, Javaltechian javaltechian){
		 spaceShip.getPopulation().add(javaltechian);
		 return spaceShip;

	 }
	 
	 public int getMaxCapacityByName(String name){ 
		 if (name.toLowerCase().startsWith("bo"))
			 return 8;
		 if (name.toLowerCase().startsWith("lo"))
			 return 64;
		 if (name.toLowerCase().startsWith("in"))
			 return 32;
		 if (name.toLowerCase().startsWith("do"))
			 return 64;
		 if (name.toLowerCase().startsWith("fl"))
			 return 32;
		 if (name.toLowerCase().startsWith("ch"))
			 return 16;
		 if (name.toLowerCase().startsWith("by"))
			 return 8;
		 if (name.toLowerCase().startsWith("sh"))
			 return 16;
		 else return 0;
	 }
	 
}
