package com.pizza.model;

public class SlicedPepperoni extends CondimentDecorator {
	Pizza pizza;
	
	public SlicedPepperoni(Pizza pizza){
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Sliced Pepperoni";
	}
	
	public int getSize(){
		return pizza.getSize();
	}

	public double cost() {
		double cost = pizza.cost();
		if(getSize() == Pizza.SMALL){
			cost += 6600;
		} else if(getSize() == Pizza.BIG){
			cost += 8000;
		}
		return cost;
	}

	public double weight() {
		double weight = pizza.weight();
		if(getSize() == Pizza.SMALL){
			weight += 50;
		} else if(getSize() == Pizza.BIG){
			weight += 70;
		}
		return weight;
	}
}
