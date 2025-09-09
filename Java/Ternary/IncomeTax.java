package com.codegnan.javaFundamentals;
import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		System.out.println("Enter the salary you got : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double tax = x<300000?x*0.05:(x>=300000 && x<1000000)?(((300000)*0.05)+((x-300000)*0.10)):(x>=1000000 && x<2000000)?((300000*0.05)+(700000*0.10)+(x-1000000)*0.15):((300000*0.05)+(700000*0.10)+((x-1000000)*15)+(x*0.01));
		System.out.println("The tax amount is : "+tax);
	}
}
