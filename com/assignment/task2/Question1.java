package com.assignment.task2;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Checking number is positive or negative");

		System.out.println("Enter Number");
		number = scanner.nextInt();
		
		
				if(number>0) {
			System.out.println("Number is positive");
		}
		else if(number<0) {
			System.out.println("Number is negative");
		}
		else if(number==0) {
			System.out.println("Number is zero");
		}
		
	}
}
