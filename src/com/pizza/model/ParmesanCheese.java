package com.pizza.model;

public class ParmesanCheese extends CondimentDecorator {
	Pizza pizza;
	
	public ParmesanCheese(Pizza pizza){
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Parmesan Cheese";
	}
	
	public int getSize(){
		return pizza.getSize();
	}

	public double cost() {
		double cost = pizza.cost();
		if(getSize() == Pizza.SMALL){
			cost += 5500;
		} else if(getSize() == Pizza.BIG){
			cost += 8300;
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
