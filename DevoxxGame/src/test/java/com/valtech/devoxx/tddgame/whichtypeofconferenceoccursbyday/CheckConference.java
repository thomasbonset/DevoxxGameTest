package com.valtech.devoxx.tddgame.whichtypeofconferenceoccursbyday;

public class CheckConference {

	String day;
	String type;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	public boolean isHappening(){
		ConferenceChecker conferenceChecker = new ConferenceChecker();
		return conferenceChecker.isConferenceHolding(type, day);
	}
}
