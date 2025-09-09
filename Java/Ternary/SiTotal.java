package com.codegnan.javaFundamentals;

import java.util.Scanner;

public class SiTotal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for P : ");
		int P = sc.nextInt();
		System.out.println("Enter value for R: ");
		 int R = sc.nextInt();
		System.out.println("Enter value for T : ");
	    int T = sc.nextInt();
	    double SI = (P*T*R)/100;
	    double total = SI+P;
	    System.out.println("The Simple Intrest is  : "+SI);
	    System.out.println("The total amount calculated is : "+total);
	}

}
