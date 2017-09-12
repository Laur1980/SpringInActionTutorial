package org.java.spring.in.action.tutorial.model;

import javax.inject.Named;

import org.springframework.stereotype.Component;

//@Component
@Named
public class CD implements CompactDisc {

	@Override
	public void play() {
			System.out.println("Playing the current CD track!");
	}

}
