package com.codegnan.Patterns;

import java.util.Scanner;

public class InverseTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<n - i-1;j++) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
		
		}
}
