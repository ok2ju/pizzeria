package com.pizza.model;

public class ThickCrustDough extends Pizza {
	
	private int sizeOfPizza;
	
	public ThickCrustDough(int sizeOfPizza){
		description = "Thick pizza with";
		this.sizeOfPizza = sizeOfPizza;
	}

	public double cost() {
		double cost = 0;
		if(sizeOfPizza == Pizza.SMALL){
			cost += 9000;
		} else if(sizeOfPizza == Pizza.BIG){
			cost += 11000;
		}
		return cost;
	}

	public double weight() {
		double weight = 0;
		if(sizeOfPizza == Pizza.SMALL){
			weight += 100;
		} else if(sizeOfPizza == Pizza.BIG){
			weight += 150;
		}
		return weight;
	}
}
