package com.pizza.model;

public class PlumTomatoSauce extends CondimentDecorator {
	Pizza pizza;
	
	public PlumTomatoSauce(Pizza pizza){
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Plum Tomato Sauce";
	}
	
	public int getSize(){
		return pizza.getSize();
	}

	public double cost() {
		double cost = pizza.cost();
		if(getSize() == Pizza.SMALL){
			cost += 4400;
		} else if(getSize() == Pizza.BIG){
			cost += 6300;
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
