package com.assignment.task4;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int s = scanner.nextInt();
		float average;
		int[] arrayList = new int[s];
		float sum = 0; 
		for(int i = 0;i<s;i++) {
			System.out.println("Enter Element "+(i+1));
			arrayList[i] = scanner.nextInt();
			sum = sum + arrayList[i];
		}
		average = sum/s;
		System.out.println("Average of Array : "+average);
		
		

	}

}
