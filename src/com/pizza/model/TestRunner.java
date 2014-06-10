package com.pizza.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestRunner {

	public static void main(String[] args) throws IOException {
		/*
		Pizza pizza1 = new ThinCrustDough(43);
		pizza1.setSize(43);
		pizza1 = new Onion(pizza1);
		pizza1 = new BlackOlives(pizza1);
		pizza1 = new MozzarellaCheese(pizza1);
		System.out.println(pizza1.getDescription() + " - " + pizza1.cost() + " b.r" + " - " + pizza1.weight() + "g ,");
		
		Pizza pizza2 = new ThinCrustDough(43);
		pizza2.setSize(43);
		pizza2 = new Onion(pizza2,3);
		System.out.println(pizza2.getDescription() + " - " + pizza2.cost() + " b.r" + " - " + pizza2.weight() + "g ," + " " + pizza2.getSize() + " cm");
		*/
		
		System.out.println("�������� ������ ����� (32�� , 43��): ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		System.out.println("�������� ������ ��� ����� (1 - ������ ������, 2 - ������� ������) :");
		int number = sc.nextInt();
		
		switch(number){
		case 1: 
			Pizza pizza4 = new ThinCrustDough(size);
			pizza4.setSize(size);
			
			String userInput = "";
			int amountOfIngredient;

			InputStreamReader converter = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(converter);

			while(!(userInput.equals("0"))){
				System.out.println("1. �������� Onion");
				System.out.println("2. �������� Garlic");
				System.out.println("0. �����");

				userInput = in.readLine();

				if("1".equals(userInput)){
					System.out.println("������� ���������� Onion'a");
					amountOfIngredient = sc.nextInt();

					pizza4 = new Onion(pizza4, amountOfIngredient);
				} 
				if("2".equals(userInput)){

					pizza4 = new Garlic(pizza4);
				}
			}
			
			//------------------------------------------
			Client client4 = new Client("gdfg", "gfdg", "sfsd", "fsdf", "2344353", "hggfdf");
			client4.setName("1");
			Order order = new Order(pizza4, client4);
			//----------------------------------------------
			
			System.out.println(pizza4.getDescription() + " - " + pizza4.cost() + " b.r ," + pizza4.weight() + "g"); //���������� � �����
			System.out.println(order.getInformationOfOrder()); //���������� � �������������� ������
			break;
		
		case 2:
			Pizza pizza5 = new ThickCrustDough(size);
			pizza5.setSize(size);
			pizza5 = new Onion(pizza5,2);
			System.out.println(pizza5.getDescription() + " - " + pizza5.cost() + " b.r ," + pizza5.weight() + "g");
			break;
			
		default: 
			System.out.println("�������� ����!");
			break;
		}
	}

}
