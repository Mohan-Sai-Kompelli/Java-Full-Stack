package com.codegnan.controlStatements;

import java.util.Scanner;

public class ATMkaro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Withdrawl amount : ");
		
		double ac_bal = 5000000.000;
		double withdraw = sc.nextDouble();
		if(withdraw<ac_bal && withdraw%100==0) {
			ac_bal -= withdraw;
			System.out.println("The amount "+withdraw+"has beeen withdrawn successfully and the avaible balance is : "+ac_bal);
		}
		else {
			//no specific logic
			System.out.println("No sufficientfunds! please add some cah to your account");
		}
		sc.close();
	}
}
