package com.codegnan.javaFundamentals;

import java.util.Scanner;

public class Number3and5 {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
		String res = x%(15)==0?"It is divisible by both 3 and 5":"It is not divisible by both 3 and 5";
		System.out.println(res);
	}
}
