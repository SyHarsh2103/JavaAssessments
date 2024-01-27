package com.assignment.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int s = scanner.nextInt();
		
		int[] arrayList = new int[s];
		if(s>3) {
			for(int i = 0;i<s;i++) {
				System.out.println("Enter Element "+(i+1));
				arrayList[i] = scanner.nextInt();
			}
			System.out.println("Created Array");
			for(int i = 0;i<s;i++) {
				
				System.out.print(arrayList[i]+" ");
			
			}
			
			Arrays.sort(arrayList);
			
			System.out.println("\nThird Largest Number from array "+(arrayList[s-3]));
			
			
		}
		else {
			System.out.println("Size not be less than 3");
		}
		
		
		

	}

}
