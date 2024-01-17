package com.assignment.task1;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		float area;
		float radius;
		
		
		System.out.println("- Enter radius value -");
		radius = scanner.nextFloat();
		
		area = (float) (3.14 * radius * radius);
		
		System.out.println("Area of circle : "+area);
		
		
		
		
		
		
	}
}
