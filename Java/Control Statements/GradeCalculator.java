package com.codegnan.controlStatements;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the grade : ");
		int marks = sc.nextInt();
		if(marks>=90) {
			System.out.println("Grade : O");
		}
		else {
			if(marks>=80) {
				System.out.println("Grade : A");
			}else {
				if(marks>=70) {
					System.out.println("Grade : B");
				}else {
					if(marks>=60) {
						System.out.println("Grade : C");
					}else {
						if(marks>=50) {
							System.out.println("Grade : D");
						}else {
							if(marks>=35) {
								System.out.println("Grade : E");
							}else {
								System.out.println("You are failed Dumbass!");
							}
						}
					}
				}
			}
		}
	}
}
