package org.java.spring.in.action.tutorial.main;

import org.java.spring.in.action.tutorial.model.BraveKnight;
import org.java.spring.in.action.tutorial.model.Quest;
import org.java.spring.in.action.tutorial.model.SlayDragonQuest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages={"org.java.spring.in.action.tutorial.model","org.java.spring.in.action.tutorial.main"})
@PropertySource("classpath:org/java/spring/in/action/tutorial/main/app.properties")
public class SpringConfig {
	
	@Autowired
	Environment env;
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Quest quest(){
		return new SlayDragonQuest();
	}
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	public BraveKnight braveKnight(){
		return new BraveKnight(quest());
	}
	
}
