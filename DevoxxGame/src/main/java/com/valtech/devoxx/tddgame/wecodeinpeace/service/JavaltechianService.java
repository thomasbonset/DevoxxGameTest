package com.valtech.devoxx.tddgame.wecodeinpeace.service;

import com.valtech.devoxx.tddgame.wecodeinpeace.model.Javaltechian;

public class JavaltechianService implements IJavaltechianService{

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

	public int getNumberOfDigitsByForename(String name){ 	
		int result=0;
		int b = name.length();
		while(b > 1){
			for(int i = 2; i < b+1; i++){
				if(isPrimeNumber(i)){
					if(b%i == 0){
						result++;
						b = b/i;
						i = b+1;
					}
				}
			}
		}
		return result;
	}

	private  boolean isPrimeNumber (int x){
		boolean prime=true;
		if (x%2==0 && x!=2 || x == 1){
			prime = false;
		}
		else{
			for(int i=3; i<=Math.sqrt(x); i+=2){
				if(x%i==0){
					prime=false;
				}
				else 
					prime=true;
			}
		}
		return prime;
	}

	public Javaltechian chifoumi(Javaltechian firstPlayer, Javaltechian secondPlayer){


		return null;
	}

	public int getPowerByName(String name) {
		int result=name.length();
		if (name.contains("java"))
			result+=5;
		if (name.endsWith("voxx"))
			result*=10;
		return result;	
	}

}
