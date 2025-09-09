package com.codegnan.controlStatements;

import java.util.Scanner;

public class Canteen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int teaprice = 10;
		int coffeeprice = 15;
		int samosaprice = 20;
		int teaqty =0,coffeeqty=0,samosaqty=0;
		int choice;
		double taxrate = 0.05;
		do {
			System.out.println("||=========== CANTEEN MENU ===========||");
			System.out.println("1. View Menu");
			System.out.println("2. Order Items");
			System.out.println("3. View Bill");
			System.out.println("4. Checkout and Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("--- MENU ---");
				System.out.println("1. Tea     - "+teaprice);
				System.out.println("2. Coffee  - "+coffeeprice);
				System.out.println("3. Samosa  - "+samosaprice);
				break;
			case 2:
				System.out.println("Enter item number to order (1-3)");
				int item = sc.nextInt();
				System.out.println("Enter the Quantity ");
				int qty = sc.nextInt();
				if(qty <= 0 ) {
					System.out.println("Quantity must be greater than 0 ");
					break;
				}
			switch(item) {
			case 1:
				teaqty+=qty;
				System.out.println(qty+" Tea(s) Added");
				break;
			case 2:
				coffeeqty+=qty;
				System.out.println(qty+" Coffee(s) Added");
				break;
			case 3:
				samosaqty+=qty;
				System.out.println(qty+" Samosa(s) Added");
				break;
			default:
				System.out.println("Invalid Item number  please give valid item number");
				break;	
			}
			break;
			case 3:
				int tt = teaqty*teaprice;
				int ct = coffeeqty*coffeeprice;
				int st  = samosaqty*samosaprice;
				int sub = tt+ct+st;
				double tax = taxrate*sub;
				double gd = sub+tax;
				
				System.out.println("======Bill======");
				if(teaqty>0) {
					System.out.println("Tea x : "+teaqty+" =$ "+tt);
				}
				if(coffeeqty>0) {
					System.out.println("Coffee x : "+coffeeqty+" =$ "+ct);
				}
				if(samosaqty>0) {
					System.out.println("Samosa x : "+samosaqty+" =$ "+st);
				}
				if(sub==0) {
					System.out.println("No item sordewred yet");
				}else {
					System.out.println("Subtotal = " +sub);
					System.out.println("Tax (5%) = " +tax);
					System.out.println("Total = " +gd );
					
				}
				break;
			case 4:
				System.out.println("Thank you .Exiting system");
				break;
			default:
				System.out.println("Please enter from 1-4");
				break;
				
			}
		}while(choice!=4);

	}

}
