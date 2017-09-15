package org.java.spring.in.action.tutorial.model;

import java.util.Random;

public class CowardlyQuest implements Quest {
	
	private String [] quests ={"Death by mauling","Burned alive by a dragon","Running away from a fight and leaving the damzel to die!",
						"Geting killed in the process!"};
	
	@Override
	public String embarck() {
		return quests[new Random().nextInt(quests.length)];
	}

}
