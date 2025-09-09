package com.codegnan.javaFundamentals;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Student Roll Number : ");
		int roll_no = sc.nextInt();
		System.out.println("Enter Student Age : ");
		int age = sc.nextInt();
		System.out.println("Enter Student Grade : ");
		char grade = sc.next().charAt(0);
		System.out.println("Name of the Student is : "+name);
		System.out.println("Roll Number of the Student is "+roll_no);
		System.out.println("Age of the Student is : "+age);
		System.out.println("Grade of the Student is  : "+grade);
		
	}
}
