package com.pizza.model;

public class Client extends User {

	private String phoneNumber;
	private String eMail;
	private String timeOfDelivery;
	private String descriptionOfOrder;
	
	public Client(String name, String surName, String phoneNumber, String eMail, String timeOfDelivery, String descriptionOfOrder) {
		super(name, surName);
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
		this.timeOfDelivery = timeOfDelivery;
		this.descriptionOfOrder = descriptionOfOrder;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	public void setTime(String timeOfDelivery){
		this.timeOfDelivery = timeOfDelivery;
	}
	
	public String getTime(){
		return timeOfDelivery;
	}
	
	public void setDescriptionOfOrder(String descriptionOfOrder){
		this.descriptionOfOrder = descriptionOfOrder;
	}
	
	public String getDescriptionOfOrder(){
		return descriptionOfOrder;
	}
}
