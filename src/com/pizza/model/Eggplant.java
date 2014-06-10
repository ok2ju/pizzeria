package com.pizza.model;

public class Eggplant extends CondimentDecorator {
	Pizza pizza;
	
	public Eggplant(Pizza pizza){
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Eggplant";
	}
	
	public int getSize(){
		return pizza.getSize();
	}

	public double cost() {
		double cost = pizza.cost();
		if(getSize() == Pizza.SMALL){
			cost += 4500;
		} else if(getSize() == Pizza.BIG){
			cost += 4800;
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
