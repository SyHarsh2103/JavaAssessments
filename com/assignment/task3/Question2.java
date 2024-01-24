package com.assignment.task3;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		System.out.println("Factorial Number");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter factorial number");
		int n = scanner.nextInt();
		long fact = 1;
		
		if(n<0) {
			System.out.println("Negative interger");
			
		}
		else {
			for(int i = 1;i<=n;i++) {
				fact *= i;
			}
			System.out.println("Factorial Number of "+n+" = "+fact);
		}
		

	}

}
