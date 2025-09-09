package com.codegnan.controlStatements;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int or_x = x;
		int rev = 0;
		while(x !=0) {
			int rem = x%10;
			rev = rev*10+rem;
			x = x/10;
		}
		if(or_x>0) {
			System.out.println(or_x+" is the original number and "+rev+" is reverse of the number");
		}else {
			System.out.println(or_x+" is the original number and "+rev*(-1)+" is reverse of the number");
		}
		// or we can write rev = -rev;
	}
}
