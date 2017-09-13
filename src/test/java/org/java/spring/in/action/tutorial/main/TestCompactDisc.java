package org.java.spring.in.action.tutorial.main;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.java.spring.in.action.tutorial.model.CompactDisc;
import org.java.spring.in.action.tutorial.model.DVD;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.contrib.java.lang.system.SystemOutRule;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringConfig2.class)
public class TestCompactDisc {
	
	@Rule
	public final SystemOutRule log = new SystemOutRule();
	
	@Inject
	@Qualifier("CD")
	private CompactDisc cd;
	
	@Autowired(required=false)
	@Qualifier("DVD")
	private CompactDisc dvd;
	
	@Test
	public void testCD(){
		assertNotNull(cd);
		cd.play();
		log.getLog();
		//System.out.println(C);
		//assertEquals("Playing the current DVD track!",log.getLog());
	}
	
	@Test
	public void testDVD(){
		assertNotNull(dvd);
		dvd.play();
		log.getLog();
		//("Playing the current CD track!",log.getLog());
	}
	
}
