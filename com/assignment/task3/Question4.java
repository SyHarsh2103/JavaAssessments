package com.assignment.task3;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		int flag = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scanner.nextInt();
		
		if(number == 0 || number == 1) {
			flag = 1;
		}
		
		for(int i = 2;i <= number/2;i++) {
			if(number % i == 0) {
				flag=1;
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
		
	}
}
