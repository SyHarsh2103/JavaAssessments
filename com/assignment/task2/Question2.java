package com.assignment.task2;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		char alpha;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Checking character is alphabet or not");
		System.out.println("Enter character");
		alpha = scanner.next().charAt(0);
		
		if((alpha >= 'a' && alpha <='z') || (alpha >= 'A' && alpha <='Z')) {
			System.out.println("Character is alphabet");
		}
		else {
			System.out.println("Character is not alphabet");
		}
		
		
	}

}
