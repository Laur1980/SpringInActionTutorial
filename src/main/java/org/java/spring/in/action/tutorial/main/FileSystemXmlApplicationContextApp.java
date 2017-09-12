package org.java.spring.in.action.tutorial.main;

import org.java.spring.in.action.tutorial.model.BraveKnight;
import org.java.spring.in.action.tutorial.model.Quest;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXmlApplicationContextApp {

	public static void main(String[] args) {
		
		try(FileSystemXmlApplicationContext context = 
				new FileSystemXmlApplicationContext("/src/main/java/springConfig.xml");){
			Quest quest = context.getBean(Quest.class);
        	BraveKnight knight = context.getBean(BraveKnight.class);
        	System.out.println(quest.embarck());
        	System.out.println(knight.embarkOnTheQuest(quest));
		}
		
	}

}
