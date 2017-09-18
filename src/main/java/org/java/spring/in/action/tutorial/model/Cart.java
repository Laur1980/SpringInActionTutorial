package org.java.spring.in.action.tutorial.model;

import java.util.Set;

public interface Cart {
	
	int getQuantity();
	
	double getTotal();
	
	Item getItem(String serial, double price);
	
	Set<Item> getItems();
	
	boolean addItem(Item item);
	
	boolean deleteItem(Item item);
	
	boolean updateItem(Item item);
	
}
