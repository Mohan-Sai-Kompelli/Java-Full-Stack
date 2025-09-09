package com.codegnan.javaFundamentals;

import java.util.Scanner;

public class Greatof2nums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		String res = x>y?"First digit is greater":"Second digit is greater";
		System.out.println(res);
	}
}
