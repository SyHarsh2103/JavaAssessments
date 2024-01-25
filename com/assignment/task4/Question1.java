package com.assignment.task4;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int s = scanner.nextInt();
		
		int[] arrayList = new int[s];
		
		for(int i = 0;i<s;i++) {
			System.out.println("Enter Element "+(i+1));
			arrayList[i] = scanner.nextInt();
		}
		
		for(int i = 0;i<s;i++) {
			System.out.print(arrayList[i]+" ");
		
		}
		

	}

}
