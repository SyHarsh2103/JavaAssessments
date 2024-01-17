package com.assignment.task1;

public class Question3 {
	public static void main(String[] args) {
		
		System.out.println("----------------------------");
		System.out.println("Swapping with third variable");
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("Before Swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		temp = a;
		a = b;
		b = temp; 
		
		
		System.out.println("After Swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("----------------------------");
		System.out.println("Swapping without third variable");
		int c = 30;
		int d = 40;
		
		System.out.println("Before Swap");
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		
		c = c + d;
		d = c - d;
		c = c - d;
		
		
		System.out.println("After Swap");
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		
		
	}
}
