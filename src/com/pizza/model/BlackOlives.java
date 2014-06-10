package com.pizza.model;

public class BlackOlives extends CondimentDecorator {
	Pizza pizza;
	
	public BlackOlives(Pizza pizza){
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Black Olives";
	}
	
	public int getSize(){
		return pizza.getSize();
	}

	public double cost() {
		double cost = pizza.cost();
		if(getSize() == Pizza.SMALL){
			cost += 6300;
		} else if(getSize() == Pizza.BIG){
			cost += 6600;
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
