package com.codegnan.Patterns;

import java.util.Scanner;

public class ReverseCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				char ch = (char) (j+96);
				System.out.print(ch+" ");
			}
			System.out.println();
		}

	}

}
