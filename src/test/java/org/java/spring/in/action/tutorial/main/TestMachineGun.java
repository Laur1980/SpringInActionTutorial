package org.java.spring.in.action.tutorial.main;

import static org.junit.Assert.assertNotNull;

import javax.inject.Named;

import org.java.spring.in.action.tutorial.model.CD;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("src/test/java/testConfig2.xml")//(locations={"file:src/main/java/springConfig2.xml"})
public class TestMachineGun {
	
	@Named
	@Qualifier("machineGunCD")
	private CD machineGun;
	
	public void testMachineGun(){
		assertNotNull(machineGun);
	}
	
}
