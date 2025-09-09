package com.codegnan.controlStatements;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit to get the table on : ");
		int x = sc.nextInt();
		for(int i=0;i<=20;i++) {
			System.out.println(x+" x "+i+" = "+x*i);
		}
	}
}
