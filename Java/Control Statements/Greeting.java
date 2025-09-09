package com.codegnan.controlStatements;

import java.util.Scanner;

public class Greeting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the city name : ");
		String city = sc.next();
		/// if we use equals is it should mandatory match it is case sensitive
		///// if we use equals_ignore case insensitive to cse and also checks only whether content is true or not 
		///password is good examples of equals
		///mail id is the good example of equals igontre
		///
		if(city.equalsIgnoreCase("hyderabad")) {
			System.out.println("Hello! Hyderabadi... Adaab..");
		}else {
			if(city.equalsIgnoreCase("chennai")) {
				System.out.println("Hello! Madrasi.. Vanakkam..");
			}else {
				if(city.equalsIgnoreCase("Banglore")) {
					System.out.println("Hello Kannadiga... Namaskara..");
				}else {
					System.out.println("Please enter valid city name ");
				}
			}
		}
	}
}
