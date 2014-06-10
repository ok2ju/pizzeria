package com.pizza.model;

public class Onion extends CondimentDecorator {
	Pizza pizza;
	int amount = 0;
	
	public Onion(Pizza pizza, int amount){
		this.pizza = pizza;
		this.amount = amount;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Onion" + "("+amount+")";
	}
	
	public int getSize(){
		return pizza.getSize();
	}

	public double cost() {
		double cost = pizza.cost();
		if(getSize() == Pizza.SMALL){
			cost += 300*amount;
		} else if(getSize() == Pizza.BIG){
			cost += 400*amount;
		}
		return cost;
	}

	public double weight() {
		double weight = pizza.weight();
		if(getSize() == Pizza.SMALL){
			weight += 40*amount;
		} else if(getSize() == Pizza.BIG){
			weight += 60*amount;
		}
		return weight;	
	}
}
