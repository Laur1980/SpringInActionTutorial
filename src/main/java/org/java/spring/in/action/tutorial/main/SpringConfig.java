package org.java.spring.in.action.tutorial.main;

import org.java.spring.in.action.tutorial.model.BraveKnight;
import org.java.spring.in.action.tutorial.model.Quest;
import org.java.spring.in.action.tutorial.model.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"org.java.spring.in.action.tutorial.model","org.java.spring.in.action.tutorial.main"})
public class SpringConfig {
	
	@Bean
	public Quest quest(){
		return new SlayDragonQuest();
	}
	
	@Bean
	public BraveKnight braveKnight(){
		return new BraveKnight(quest());
	}
	
}
