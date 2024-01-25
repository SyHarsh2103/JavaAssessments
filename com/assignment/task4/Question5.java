package com.assignment.task4;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of row");
		int row = scanner.nextInt();
		System.out.println("Enter number of column");
		int column = scanner.nextInt();
		
		int[][] matrix1 = new int[row][column];
		int[][] matrix2 = new int[row][column];
		int[][] sumMatrix = new int[row][column];
		
		System.out.println("Enter Matrix 1 element");
		for(int i = 0 ; i<row;i++) {
			for(int j = 0 ; j<column;j++) {
				System.out.println("Row "+(i+1)+" column "+(j+1));
				matrix1[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("Enter Matrix 2 element");
		for(int i = 0 ; i<row;i++) {
			for(int j = 0 ; j<column;j++) {
				System.out.println("Row "+(i+1)+" column "+(j+1));
				matrix2[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("Printing Matrix 1");
		for(int i = 0 ; i<row;i++) {
			for(int j = 0 ; j<column;j++) {
				System.out.print(" "+matrix1[i][j]);
			}
		}
		System.out.println("\nPrinting Matrix 2");
		for(int i = 0 ; i<row;i++) {
			for(int j = 0 ; j<column;j++) {
				System.out.print(" "+matrix2[i][j]);
			}
		}
		
		
		for(int i = 0 ; i<row;i++) {
			for(int j = 0 ; j<column;j++) {
				sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println("\nSum of Matrix");
		for(int i = 0 ; i<row;i++) {
			for(int j = 0 ; j<column;j++) {
				System.out.print(" "+sumMatrix[i][j]);
			}
		}
	}

}
