package com.codegnan.Arrays;

import java.util.Scanner;

public class Priority6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		boolean x = false;
		if(n>=1) {
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
				if(a[0]==6 || a[n-1]==6) {
					x = true;
				}
			}
			System.out.println(x);
		}
		
		

	}

}
