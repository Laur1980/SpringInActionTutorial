package org.java.spring.in.action.tutorial.model;

import org.springframework.stereotype.Component;

@Component
public class DVD implements CompactDisc {

	@Override
	public void play() {
			System.out.println("Playing the current DVD track!");
	}

}
