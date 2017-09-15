package org.java.spring.in.action.tutorial.main;

import org.java.spring.in.action.tutorial.model.BraveKnight;
import org.java.spring.in.action.tutorial.model.Knight;
import org.java.spring.in.action.tutorial.model.MachineGunCD;
import org.java.spring.in.action.tutorial.model.Quest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextApp2 {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig2.xml")){
        	Quest quest = context.getBean("saveDamzelQuest",Quest.class);
        	Knight braveKnight = context.getBean("braveKnight",Knight.class);
        	MachineGunCD mcd = context.getBean("machineGunCD",MachineGunCD.class);
        	Knight cowardlyKnight = context.getBean("cowardlyKnight",Knight.class);
        	System.out.println(braveKnight);
        	System.out.println(cowardlyKnight);
        	System.out.println(quest.embarck());
        	System.out.println(braveKnight.embarkOnTheQuest());
        	for(int i=0;i<5;i++)mcd.play();
        	System.out.println(cowardlyKnight.embarkOnTheQuest());
        }
	}

}
