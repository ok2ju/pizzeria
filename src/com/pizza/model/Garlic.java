package com.pizza.model;

public class Garlic extends CondimentDecorator {
	Pizza pizza;
	
	public Garlic(Pizza pizza){
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Garlic";
	}
	
	public int getSize(){
		return pizza.getSize();
	}

	public double cost() {
		double cost = pizza.cost();
		if(getSize() == Pizza.SMALL){
			cost += 200;
		} else if(getSize() == Pizza.BIG){
			cost += 400;
		}
		return cost;
	}

	public double weight() {
		double weight = pizza.weight();
		if(getSize() == Pizza.SMALL){
			weight += 20;
		} else if(getSize() == Pizza.BIG){
			weight += 40;
		}
		return weight;
	}
}
