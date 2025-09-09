package com.codegnan.controlStatements;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int x = sc.nextInt();
		do{
				int d = x%10;
				sum=sum+(d*d*d);
				x = x/10;
			
		}while(x>0);
		System.out.println(sum);
	}
}
