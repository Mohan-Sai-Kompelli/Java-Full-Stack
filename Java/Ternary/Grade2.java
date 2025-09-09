package com.codegnan.javaFundamentals;

import java.util.Scanner;

public class Grade2 {
	public static void main(String[] args) {
		System.out.println("Enter the marks you got : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		char c = x>=90?'O':(x>=80 && x<90)?'S':(x>=70 && x<80)?'A':(x>=60 && x<70)?'B':(x>=50 && x<60)?'C':(x>=35 && x<50)?'D':'F';
		System.out.println("The Grade the sudent got is  : "+c);
	}
}
