package com.valtech.devoxx.tddgame.wecodeinpeace.model;

public enum Choice {
	
	stone, paper, scissors;
	public static Choice getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
