package com.assignment.task2;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your amount to calculate Tax");
		double income  = scanner.nextDouble();
		
		double tax;
		if (income <= 250000) {
            tax = 0;
        } else if (income > 250000 && income <= 600000) {
            tax = 0.1 * (income - 250000);
        } else if (income > 600000 && income <= 1200000) {
            tax = 0.18 * (income - 600000) + 0.1 * (600000 - 250000);
        } else {
            tax = 0.25 * (income - 1200000) + 0.18 * (1200000 - 600000) + 0.1 * (600000 - 250000);
        }
		
		System.out.println("Tax "+tax);
		

	}

}
