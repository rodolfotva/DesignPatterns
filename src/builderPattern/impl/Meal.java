package builderPattern.impl;

import java.util.LinkedList;
import java.util.List;

import builderPattern.interfaces.Item;

public class Meal {
	
	private List<Item> itens = new LinkedList<>();
	
	public void addItem(Item item){
		itens.add(item);
	}
	
	public Double getPrice(){
		Double totalPrice = new Double(0.0);
		for(Item value : itens){
			totalPrice += value.price();
		}
		return totalPrice;
	}
	
	public void showItens(){
		for (Item item : itens) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
	    }	
	}

}
