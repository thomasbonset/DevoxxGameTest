package com.valtech.devoxx.tddgame.wecodeinpeace.service;

import com.valtech.devoxx.tddgame.wecodeinpeace.model.Javaltechian;

public class JavaltechianService {

	public int givePowerByName(String name){
		int result=name.length();
		if (name.contains("java"))
			result+=5;
		if (name.endsWith("voxx"))
			result*=10;
		return result;	
	}
	
	public int giveAgeByName(String name){
		int result=0;
		for (byte byteName : name.getBytes()) {
			result+=byteName;
		System.out.println(byteName);
		}
		return result;	
	}
	
	public int giveNumberOfEyesByName(String name){ 	
		int result=2;
		int i;
	         double racine=Math.sqrt(name.length());
	         for(i=2; i<=racine;i++) 
	        	 if(name.length() % i == 0)
	        		 result++;
	         return result;
	}
	
	
	public Javaltechian chifoumi(Javaltechian firstPlayer, Javaltechian secondPlayer){
		
		
		return null;
	}
	
}
