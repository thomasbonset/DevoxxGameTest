package com.valtech.devoxx.tddgame.whichtypeofconferenceoccursbyday;

import com.valtech.devoxx.tddgame.tools.ConferenceType;

public class CheckTypeOfConference {
	public String day;
	public int beginningTime;
	public String room;
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getBeginningTime() {
		return beginningTime;
	}
	public void setBeginningTime(int time) {
		this.beginningTime = time;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	
	public String expectedType(){
		return ConferenceType.CONFERENCE.toString();
	}
	
}
