package com.codegnan.javaFundamentals;

import java.util.Scanner;


public class PosandNeg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt();
		String res = x>0?"Positive":"Negative";
		System.out.println(res);
	}
}
