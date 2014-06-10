package com.pizza.model;

public abstract class Pizza {
	
	String description = "Unknown pizza";
	int size = 0;
	int amount = 0;
	public static final int SMALL = 32;
	public static final int BIG = 43;
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
	
	public abstract double weight();
	
	public void setSize(int size){
		this.size = size;
	}
	
	public int getSize(){
		return size;
	}
	
	//-------------------------------------------------------------------------------------------------
	
	public void setAmountOfPizza(int amount){
		this.amount = amount;
	}
	
	public int getAmountOfPizza(){
		return amount;
	}
}
