package com.assignment.task4;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int s = scanner.nextInt();
		int flag = 0;
		
		int[] arrayList = new int[s];
		
		for(int i = 0;i<s;i++) {
			System.out.println("Enter Element "+(i+1));
			arrayList[i] = scanner.nextInt();
		}
		
		for(int i = 0;i<s;i++) {
			System.out.print(arrayList[i]+" ");
		
		}
		
		System.out.println("\nEnter Target Number");
		int target = scanner.nextInt();
		
		for(int i = 0;i<s-1;i++) {
			for(int j = i+1;j<s;j++) {
				if(arrayList[i]+arrayList[j]==target) {
					flag = 1;
					System.out.println("["+arrayList[i]+","+arrayList[j]+"]");
				}
			}
		}
		
		if(flag==0) {
			System.out.println("No pair found");
		}

	}

}
