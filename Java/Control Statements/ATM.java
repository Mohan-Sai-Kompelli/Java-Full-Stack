package com.codegnan.controlStatements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        final int pin = 2112; // original pin
        Scanner sc = new Scanner(System.in);
        double balance = 50000; // initial account balance

        System.out.println("Enter your PIN: ");
        int enteredpin = sc.nextInt();

        if (enteredpin != pin) {
            System.out.println("Incorrect PIN! Exiting...");
            return; // stop program if PIN is wrong
        }

        int choice;
        do {
            System.out.println("\n||====================||");
            System.out.println("||      ATM MENU      ||");
            System.out.println("|| 1. CHECK BALANCE   ||");
            System.out.println("|| 2. DEPOSIT         ||");
            System.out.println("|| 3. WITHDRAW        ||");
            System.out.println("|| 4. EXIT            ||");
            System.out.println("||====================||");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: ");
                    double deposit = sc.nextDouble();
                    if (deposit % 100 != 0) {
                        System.out.println("Please deposit multiples of 100 (e.g., 500, 700, 1000, 1200).");
                    } else if (deposit < 500) {
                        System.out.println("Please deposit at least 500 rupees.");
                    } else {
                        balance += deposit;
                        System.out.println("Deposited: " + deposit + " successfully. Updated balance: " + balance);
                    }
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawal = sc.nextDouble();
                    if (withdrawal % 100 != 0) {
                        System.out.println("Please enter multiples of 100 (e.g., 500, 700, 1000, 1200).");
                    } else if (withdrawal < 500) {
                        System.out.println("The minimum withdrawal limit is 500 rupees.");
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdrawal;
                        System.out.println("Withdrawal amount: " + withdrawal + ". Remaining balance: " + balance);
                    }
                    break;
                case 4:
                    System.out.println("Exited!! Thank you for using our ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose between 1-4.");
                    break;
            }
            }while(choice!=4);
    }
}
