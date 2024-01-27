package com.assignment.task4;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array 1");
		int s1 = scanner.nextInt();
		int flag = 0;
		
		int[] arrayList1 = new int[s1];
		
		for(int i = 0;i<s1;i++) {
			System.out.println("Enter Element "+(i+1));
			arrayList1[i] = scanner.nextInt();
		}
		
		for(int i = 0;i<s1;i++) {
			System.out.print(arrayList1[i]+" ");
		
		}
		
		System.out.println("\nEnter size of array 2");
		int s2 = scanner.nextInt();
		
		int[] arrayList2 = new int[s2];
		
		for(int i = 0;i<s2;i++) {
			System.out.println("Enter Element "+(i+1));
			arrayList2[i] = scanner.nextInt();
		}
		
		for(int i = 0;i<s2;i++) {
			System.out.print(arrayList2[i]+" ");
		
		}
		
		System.out.println("\nChecking Equality of Array");
		if(s1==s2) {
			System.out.println("Size of Array 1 and Array 2 is equal");
			for(int j = 0;j<s2;j++) {
				if(arrayList1[j] != arrayList2[j]) {
					flag=1;
					break;
				}
			}
			if(flag==1) {
				System.out.println("Values of Array 1 and Array 2 are not equal");
			}
			else {
				System.out.println("Values of Array 1 and Array 2 are equal");
			}
			
		}
		else {
			System.out.println("Size of Array 1 and Array 2 is not equal");
		}
		
		
		
	}

}
