package com.codegnan.javaFundamentals;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {

	System.out.println("Enter the breadth value: ");
	Scanner sc = new Scanner(System.in);
	int b = sc.nextInt();
	System.out.println("Enter the heigth value: ");
	int h = sc.nextInt();
	double area = 0.5*b*h;
	System.out.println("THE area of the traingle is : "+area);
	}
}
