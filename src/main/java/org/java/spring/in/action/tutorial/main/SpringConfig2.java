package org.java.spring.in.action.tutorial.main;

import org.java.spring.in.action.tutorial.model.CD;
import org.java.spring.in.action.tutorial.model.DVD;
import org.java.spring.in.action.tutorial.model.ScanTarget;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses={ScanTarget.class})//{CD.class,DVD.class})
public class SpringConfig2 {}
