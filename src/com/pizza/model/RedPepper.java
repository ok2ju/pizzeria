package com.pizza.model;

public class RedPepper extends CondimentDecorator {
	Pizza pizza;
	
	public RedPepper(Pizza pizza){
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Red Pepper";
	}
	
	public int getSize(){
		return pizza.getSize();
	}

	public double cost() {
		double cost = pizza.cost();
		if(getSize() == Pizza.SMALL){
			cost += 3000;
		} else if(getSize() == Pizza.BIG){
			cost += 4500;
		}
		return cost;
	}

	public double weight() {
		double weight = pizza.weight();
		if(getSize() == Pizza.SMALL){
			weight += 50;
		} else if(getSize() == Pizza.BIG){
			weight += 80;
		}
		return weight;
	}
}
