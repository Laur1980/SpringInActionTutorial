package org.java.spring.in.action.tutorial.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.inject.Named;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Named
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ShoppingCart implements Cart {
	
	private Set<Item> items;
	
	public ShoppingCart(){
		items = new LinkedHashSet<>();
	}
	
	@Override
	public int getQuantity() {
		return items.size();
	}

	@Override
	public double getTotal() {
		double total =0;
		for(Item i: items) total+=i.getPrice();
		return total;
	}

	@Override
	public Item getItem(String serial, double price) {
		Item item = null;
		for(Item i:items){
			if(i.getSerial().equals(serial) && i.getPrice() == price)item = i;
		}
		return item;
	}

	@Override
	public Set<Item> getItems() {
		return items;
	}

	@Override
	public boolean addItem(Item item) {
		if(items.contains(item))return false;
		items.add(item);
		return false;
	}

	@Override
	public boolean deleteItem(Item item) {
		if(!items.contains(item))return false;
		items.remove(item);
		return true;
	}

	@Override
	public boolean updateItem(Item item) {
		if(!items.contains(item))return false;
		items.add(item);
		return true;
	}

}
