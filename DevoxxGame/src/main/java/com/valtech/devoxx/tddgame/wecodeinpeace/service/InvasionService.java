package com.valtech.devoxx.tddgame.wecodeinpeace.service;

public class InvasionService {
	public int giveNumberOfEyesByName(String name){ 	
		int result=2;
		int i;
	         double racine=Math.sqrt(name.length());
	         for(i=2; i<=racine;i++) 
	        	 if(name.length() % i == 0)
	        		 result++;
	         return result;
	}
	
}
