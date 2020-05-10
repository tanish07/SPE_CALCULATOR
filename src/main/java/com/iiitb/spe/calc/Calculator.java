package com.iiitb.spe.calc;
import java.util.*;

public class Calculator {
	public static void main(String args[]) {
		boolean execute = true;
		int choice;
		double number1, number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Basic Calculator System");
		System.out.println("");
		do {
			System.out.println("Option Menu for Basic Operations");
			System.out.println("");
			System.out.println("1) Addition");
			System.out.println("2) Subtraction");
			System.out.println("3) Division");
			System.out.println("4) Multiplication");
			System.out.println("5) Exit");
			choice = sc.nextInt();
			if (choice == 5) {
				execute = false;
			} else {
				switch (choice) {
				case 1:
					System.out.println("Addition");
					System.out.println("Enter the two numbers");
					System.out.println("Enter number 1");
					number1 = sc.nextDouble();
					System.out.println("Enter number 2");
					number2 = sc.nextDouble();
					System.out.println(number1 + number2);
					System.out.println("");
					break;
				default:
					System.out.println("Exiting program due to invalid input");
					execute = false;

				}
			}
		} while (execute == true);
	}

}
