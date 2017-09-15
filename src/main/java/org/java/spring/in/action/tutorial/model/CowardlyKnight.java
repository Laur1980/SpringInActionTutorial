package org.java.spring.in.action.tutorial.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CowardlyKnight implements Knight {
	
	private Quest quest;
	
	@Override
	public String embarkOnTheQuest() {
		return quest.embarck();
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}	
	
}
