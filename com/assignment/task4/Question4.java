package com.assignment.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int flag = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int s = scanner.nextInt();
		
		int[] arrayList = new int[s];
		
		for(int i = 0;i<s;i++) {
			System.out.println("Enter Element "+(i+1));
			arrayList[i] = scanner.nextInt();
		}
		
		Arrays.sort(arrayList);
		System.out.println("Sorted Array");
		for(int i = 0;i<s;i++) {
			System.out.print(arrayList[i]+" ");
		}
		
		System.out.println("\nEnter the element which you want to search using binary search");
		int search = scanner.nextInt();
		
		int l = 0,r = s-1;
		
		while(l<=r) {
			int m = l + (r-l)/2;
			
			if(arrayList[m]==search) {
				flag = 1;
				break;
			}
			else if (arrayList[m]<search) {
				l = m + 1;
			}
			else {
				r = m -1;
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
