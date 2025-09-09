package com.codegnan.controlStatements;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int age = sc.nextInt();
		double x = sc.nextDouble();
		double res = x>0 && x<=100?x*1.5:x>100 &&x<=200?(100*1.5+(x-100)*2):(x>200 && x<=300)?(100*1.5+100*2+(x-200)*3):x>300 &&x<=1000?(150+200+300+(x-300)*5):(150+200+300+(x-300)*5)+(150+200+300+(x-300)*5)*0.10;
		if(age>60 ) {
			res*= 0.05;
		}
		System.out.println(res);
	}
}
