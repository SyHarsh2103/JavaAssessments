package com.assignment.task3;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		System.out.println("Checking Palindrone Number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int r,real,reverse = 0;
		real = n;
		while(n != 0) {
			r = n % 10;
			reverse = reverse * 10 + r;
			n /= 10;
		}
		if(real == reverse) {
			System.out.println("Palindrone Number");
		}
		else {
			System.out.println("Not Palindrone Number");
		}
		
	}
}
