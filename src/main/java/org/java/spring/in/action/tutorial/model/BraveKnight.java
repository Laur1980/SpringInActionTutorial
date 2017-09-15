package org.java.spring.in.action.tutorial.model;

public class BraveKnight implements Knight{
				
	private Quest quest;

	public BraveKnight(Quest quest) {
			this.quest = quest;
	}

	public String embarkOnTheQuest(){
		return quest.embarck();
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}
	
}
