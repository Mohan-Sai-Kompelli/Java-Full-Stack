package com.codegnan.javaFundamentals;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String res = x%4==0 && x%100!=0?(x%400==0)?"Leap Year":"leap Year":"Not a laeap year";
		System.out.println(res);
	}
}
