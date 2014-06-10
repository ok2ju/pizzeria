package com.pizza.model;

public class ReggianoCheese extends CondimentDecorator {
	Pizza pizza;
	
	public ReggianoCheese(Pizza pizza){
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Reggiano Cheese";
	}
	
	public int getSize(){
		return pizza.getSize();
	}

	public double cost() {
		double cost = pizza.cost();
		if(getSize() == Pizza.SMALL){
			cost += 4000;
		} else if(getSize() == Pizza.BIG){
			cost += 6000;
		}
		return cost;
	}

	public double weight() {
		double weight = pizza.weight();
		if(getSize() == Pizza.SMALL){
			weight += 50;
		} else if(getSize() == Pizza.BIG){
			weight += 75;
		}
		return weight;
	}
}
