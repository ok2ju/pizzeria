package com.pizza.model;

public class ThinCrustDough extends Pizza {
	
	private int sizeOfPizza;
	
	public ThinCrustDough(int sizeOfPizza){
		description = "Thin pizza with";
		this.sizeOfPizza = sizeOfPizza;
	}

	public double cost() {
		double cost = 0;
		if(sizeOfPizza == Pizza.SMALL){
			cost += 8500;
		} else if(sizeOfPizza == Pizza.BIG){
			cost += 10000;
		}
		return cost;
	}
	
	public double weight() {
		double weight = 0;
		if(sizeOfPizza == Pizza.SMALL){
			weight += 70;
		} else if(sizeOfPizza == Pizza.BIG){
			weight += 100;
		}
		return weight;
	}
}
