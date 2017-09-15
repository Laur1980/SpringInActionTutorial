package org.java.spring.in.action.tutorial.main;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.java.spring.in.action.tutorial.model.BraveKnight;
import org.java.spring.in.action.tutorial.model.Quest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BraveKnightTest {
	
	private BraveKnight knight;
	@Mock
	private Quest quest;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);		
		knight = new BraveKnight(quest);
	}
	
	@After
	public void tearDown(){
		knight= null;
	}
	
	@Test
	public void testEmbark() {
		when(quest.embarck()).thenReturn("Quest is done!");
		assertEquals(knight.embarkOnTheQuest(),"Quest is done!");
		verify(quest,times(1)).embarck();
		System.out.println(">>>"+quest.embarck()+"<<<");
		System.out.println(">>>"+knight.embarkOnTheQuest()+"<<<");
	}

}
