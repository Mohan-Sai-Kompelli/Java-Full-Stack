package com.codegnan.controlStatements;

import java.util.Scanner;

public class Canteen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		int ans = 0, ans1 = 0;
		String res1 = "";
		int x ;
		do {
			
			System.out.println("||=========== CANTEEN MENU ===========||");
			System.out.println("1. View Menu");
			System.out.println("2. Order Items");
			System.out.println("3. View Bill");
			System.out.println("4. Checkout and Exit");
			System.out.println("Enter your choice: ");
			x = sc.nextInt();
			switch (x) {
			case 1:
				System.out.println("--- MENU ---");
				System.out.println("1. Tea     - ₹10");
				System.out.println("2. Coffee  - ₹15");
				System.out.println("3. Samosa  - ₹20");
				break;
			case 2:
				System.out.println("Enter item number to order (1-3): ");
				int y = sc.nextInt();
				System.out.println("Enter quantity: ");
				int z = sc.nextInt();
				res = y == 1 ? 10 : y == 2 ? 15 : y == 3 ? 20 : 0;
				ans = z * y;
				ans1 = z;
				res1 = z >= 1 && y == 1 ? "Tea's ordered : "
						: z >= 1 && y == 2 ? "Coffee's ordered : "
								: z >= 1 && y == 3 ? "Samosa's ordered : " : "Invalid Quantity";
				System.out.println(res1 + z);
				break;
			case 3:
				System.out.println(res1 + ans1);
				System.out.println("Subtotal = " + ans);
				System.out.println("Tax (5%) = " + ans * 0.05);
				System.out.println("Total = " + (ans + ans * 0.05));
				break;
			case 4:
				System.out.println("Thank you Exiting the System");
				break;
			default:
				System.out.println("Enter the valid Number");
				break;

			}

		} while (x != 4);
		sc.close();

	}
}
