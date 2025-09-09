package com.codegnan.Patterns;

import java.util.Scanner;

public class Characters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				char ch = (char) (j+96);
				System.out.print(ch+" ");
			}
			System.out.println();
		}

	}

}
