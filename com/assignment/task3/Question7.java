package com.assignment.task3;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int i,j;
		
		for(i = n;i>=1;i--) {
			
			for(j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			for(j=0;j<=n-i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
