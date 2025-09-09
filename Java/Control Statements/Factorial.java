package com.codegnan.controlStatements;

import java.util.Scanner;

public class Factorial {
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int mul=1;
		for(int i=1;i<=x;i++) {
			mul *= i; 
		}
		System.out.println(mul);
	}
}
