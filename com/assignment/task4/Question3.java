package com.assignment.task4;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int s = scanner.nextInt();
		
		int[] arrayList = new int[s];
		int flag = 0;
		for(int i = 0;i<s;i++) {
			System.out.println("Enter Element "+(i+1));
			arrayList[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the element which you want to search");
		int search = scanner.nextInt();
		
		for(int i = 0;i<s;i++) {
			if(arrayList[i] == search) {
				flag = 1;
				break;
			}
			
		}
		
		if(flag == 0) {
			System.out.println("Element is not present in Array");
		}
		else if(flag == 1) {
			System.out.println("Element is present in Array");
		}
		

	}

}
