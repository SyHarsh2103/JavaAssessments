package com.assignment.task3;

import java.util.Scanner;

public class Question5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter N Number");
	int number = scanner.nextInt();
	int i = 1,sumEven = 0;
	
	while(number > 0) {
		if(i % 2 == 0) {
			sumEven += i;
			number--;
		}
		i++;
	}
	System.out.println("Sum of Even Number - "+sumEven);
	
}
}
