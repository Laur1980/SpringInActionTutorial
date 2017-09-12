package org.java.spring.in.action.tutorial.model;

public class BraveKnight {
				
	private Quest quest;

	public BraveKnight(Quest quest) {
			this.quest = quest;
	}

	public String embarkOnTheQuest(Quest quest){
		return quest.embarck();
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}
	
}
