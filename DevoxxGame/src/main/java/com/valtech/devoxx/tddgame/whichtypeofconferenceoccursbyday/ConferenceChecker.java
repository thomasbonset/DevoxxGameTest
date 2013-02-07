package com.valtech.devoxx.tddgame.whichtypeofconferenceoccursbyday;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.valtech.devoxx.tddgame.tools.ConferenceType;

public class ConferenceChecker {
	 Map<DayOfWeek, List<ConferenceType>> devoxxMap;

	public boolean isConferenceHolding(String type, String day){		
		feedMap();		
		DayOfWeek dayOfWeek = null;	
		ConferenceType conferenceType = null;
		switch (day) {
		case "wednesday":
			dayOfWeek = DayOfWeek.WEDNESDAY;
			break;
		case "thursday":
			dayOfWeek = DayOfWeek.THURSDAY;
			break;
		case "friday":
			dayOfWeek = DayOfWeek.FRIDAY;
			break;
		default:
			System.out.println("no Devoxx on this day");
			break;
		}
		
		switch (type) {
		case "university":
			conferenceType = ConferenceType.UNIVERSITY;
			break;
		case "conference":
			conferenceType = ConferenceType.CONFERENCE;
			break;
		case "lab":
			conferenceType = ConferenceType.LAB;
			break;
		case "quickie":
			conferenceType = ConferenceType.QUICKIE;
			break;
		case "tools in action":
			conferenceType = ConferenceType.TOOLS_IN_ACTION;
			break;		
		default:
			System.out.println("not this type");
			break;
		}
	
		List<ConferenceType> confInDay = devoxxMap.get(dayOfWeek);
		return confInDay.contains(conferenceType);	
	}
	
	private void feedMap() {
		devoxxMap = new HashMap<>();
		List<ConferenceType> wednesdayList=new ArrayList<>();
		wednesdayList.add(ConferenceType.UNIVERSITY);
		wednesdayList.add(ConferenceType.LAB);
		List<ConferenceType> thursdayList=new ArrayList<>();
		thursdayList.add(ConferenceType.CONFERENCE);
		thursdayList.add(ConferenceType.QUICKIE);
		List<ConferenceType> fridayList=new ArrayList<>();
		fridayList.add(ConferenceType.CONFERENCE);
		fridayList.add(ConferenceType.TOOLS_IN_ACTION);
		devoxxMap.put(DayOfWeek.WEDNESDAY, wednesdayList);
		devoxxMap.put(DayOfWeek.THURSDAY, thursdayList);
		devoxxMap.put(DayOfWeek.FRIDAY, fridayList);	
	}
}
