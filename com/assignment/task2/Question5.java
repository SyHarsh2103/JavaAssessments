package com.assignment.task2;

import java.util.Scanner;

public class Question5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float percentage;
		System.out.println("Enter your percentage");
		percentage = scanner.nextFloat();
		
		if(percentage > 90 && percentage <= 100) {
			System.out.println("You got 'A' Grade");
		}
		else if(percentage > 75 && percentage <= 90) {
			System.out.println("You got 'B' Grade");
		}
		else if((percentage > 65 && percentage <= 75)) {
			System.out.println("You got 'C' Grade");
		}
		else {
			System.out.println("No Grade");
		}
		
	}

}
