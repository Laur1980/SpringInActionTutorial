package org.java.spring.in.action.tutorial.main;

import org.java.spring.in.action.tutorial.model.BraveKnight;
import org.java.spring.in.action.tutorial.model.Quest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextApp {

	public static void main(String[] args) {
			try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);){
				Quest quest = context.getBean(Quest.class);
	        	BraveKnight knight = context.getBean(BraveKnight.class);
	        	System.out.println(quest.embarck());
	        	System.out.println(knight.embarkOnTheQuest());
			}
	}

}
