package com.codegnan.Arrays;

import java.util.Scanner;

public class Maxxx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n]; 
		int maxi = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			if(a[i]>maxi) {
				maxi=a[i];
			}
		}

		for(int j=0;j<n;j++) {
			a[j] = maxi;
			System.out.print(a[j]+" ");
		}
		
	}

}
