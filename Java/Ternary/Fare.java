package com.codegnan.javaFundamentals;

import java.util.Scanner;

public class Fare {
	public static void main(String[] args) {
		System.out.println("Enter the distance in km : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
//		double fare = (x<=2)?50:(x>2 && x<=8)?(50+(15*(x-2))):(x>10 && x<=20)?(50+(8*15)+(10*(x-10))):((50+10*(x-2))*0.05);
//		double ans = x>20?((50+10*(x-2))*0.05+(50+10*(x-2))):fare;\
		double fare = (x<=2)?50:(x>2 && x<=10)?(50+(15*(x-2))):(50+(8*15)+(10*(x-10)));
		fare = (x>20) ? fare*0.95 :fare;
		System.out.println("THE TOTAL FARE :"+fare);
	}
}
