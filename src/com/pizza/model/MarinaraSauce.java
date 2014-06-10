package com.pizza.model;

public class MarinaraSauce extends CondimentDecorator {
	Pizza pizza;
	
	public MarinaraSauce(Pizza pizza){
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Marinara Sauce";
	}
	
	public int getSize(){
		return pizza.getSize();
	}

	public double cost() {
		double cost = pizza.cost();
		if(getSize() == Pizza.SMALL){
			cost += 5500;
		} else if(getSize() == Pizza.BIG){
			cost += 5800;
		}
		return cost;
	}

	public double weight() {
		double weight = pizza.weight();
		if(getSize() == Pizza.SMALL){
			weight += 30;
		} else if(getSize() == Pizza.BIG){
			weight += 60;
		}
		return weight;
	}
}
