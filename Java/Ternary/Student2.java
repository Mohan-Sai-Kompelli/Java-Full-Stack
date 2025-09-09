package com.codegnan.javaFundamentals;

import java.util.Scanner;

public class Student2 {
	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String res = x<35?"Student failed the subject":"Student passed the subject";
		System.out.println(res);
	}
}
