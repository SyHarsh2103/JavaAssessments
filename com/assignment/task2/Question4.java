package com.assignment.task2;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year;
		System.out.println("Checking year is leap or not");
		System.out.println("Enter year");
		year = scanner.nextInt();
		
		if((year%4) == 0) {
			System.out.println(year+" is leap year");
		}
		else {
			System.out.println(year+" is not leap year");
		}
		
	}
}	
