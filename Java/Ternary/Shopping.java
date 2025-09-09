package com.codegnan.javaFundamentals;

import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double ans = (x>=1000)?(x*0.2):(x>=500 && x<1000)?(x*0.1):(x*0.5);
		double total = x-ans;
		System.out.println("The total amount after the discount is  : "+total);
	}
}
