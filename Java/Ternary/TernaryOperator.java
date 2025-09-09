package com.codegnan.javaFundamentals;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int x = sc.nextInt();
		
		String result = (x >= 18)?"You are Eligible to Vote":"You still got "+(18-x)+" years to vote";
				System.out.println(result);
	}
}
