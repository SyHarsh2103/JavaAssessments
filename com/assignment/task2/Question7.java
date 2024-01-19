package com.assignment.task2;

import java.util.Scanner;

public class Question7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("Enter any number");
			int num = scanner.nextInt();
			
			if(num < 0) {
				System.out.println("It's over");
				break;
			}
			else if(num >= 0) {
				System.out.println("Good Going");
				continue;
			}
			
		}
	}

}
