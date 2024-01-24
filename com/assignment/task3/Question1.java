package com.assignment.task3;

import java.util.Scanner;

public class Question1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Fibonacci Series");
	int a=0,b=1,c;
	System.out.println("How many terms you want ?");
	int n = scanner.nextInt();
	
	
	for(int i = 0;i<=n;i++) {
	
		System.out.print(a+" ");
		c = a + b;
		a = b;
		b = c;
	
		
		}
	}
	
}

