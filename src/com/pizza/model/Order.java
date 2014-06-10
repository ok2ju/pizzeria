package com.pizza.model;

public class Order {
	
	Pizza pizza;
	Client client;
	
	public Order(Pizza pizza, Client client){
		this.pizza = pizza;
		this.client = client;
	}
	
	public String getInformationOfOrder(){
		return pizza.getDescription() + " - " + pizza.cost()+" b.r." + " ," + pizza.weight()+" g" + "\n" + client.getName() + " " + client.getSurName() + " " + client.getPhoneNumber() + " " + client.geteMail();
	}
}
