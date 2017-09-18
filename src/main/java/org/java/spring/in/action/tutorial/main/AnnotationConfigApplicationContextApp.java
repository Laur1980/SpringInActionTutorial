package org.java.spring.in.action.tutorial.main;

import org.java.spring.in.action.tutorial.model.BraveKnight;
import org.java.spring.in.action.tutorial.model.Cart;
import org.java.spring.in.action.tutorial.model.Quest;
import org.java.spring.in.action.tutorial.model.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextApp {

	public static void main(String[] args) {
			try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);){
				Quest quest = context.getBean(Quest.class);
	        	BraveKnight knight = context.getBean(BraveKnight.class);
	        	Cart cart = context.getBean("shoppingCart",Cart.class);
	        	System.out.println(quest.embarck());
	        	System.out.println(knight.embarkOnTheQuest());
	        	System.out.println(cart);
			}
	}

}
