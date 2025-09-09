package com.codegnan.javaFundamentals;

import java.util.Scanner;

public class SIandCImonths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for P : ");
		int p = sc.nextInt();
		System.out.println("Enter the value for r : ");
		int r = sc.nextInt();
		System.out.println("Enter the value for n : ");
		int n = sc.nextInt();
		System.out.println("Enter the value for t : ");
		int t = sc.nextInt();
		double CI = (p*(1+(r/n))^(n*t))-p;
		double SI = ((p*n*r)/(n*100));
		System.out.println("The Simple intrest in " +n+ "months is : "+SI);
		System.out.println("The Compund intrest in " +n+ "months is : "+CI);
	}
}
