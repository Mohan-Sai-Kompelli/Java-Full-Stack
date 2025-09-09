package com.codegnan.Patterns;

import java.util.Scanner;

public class LeftAnglestars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-(n-i));j++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				//System.out.print(" "+j);
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
