package org.java.spring.in.action.tutorial.model;

import java.util.List;
import java.util.Random;

import javax.inject.Named;

@Named
public class MachineGunCD implements CompactDisc {
	
	private List<String> tracks;
		
	public MachineGunCD(List<String> tracks) {
		this.tracks = tracks;
	}

	@Override
	public void play() {
		System.out.println(tracks == null?"No tracks in the machine-gun!":tracks.get(new Random().nextInt(tracks.size())));
	}

}
