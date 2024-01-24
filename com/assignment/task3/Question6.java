package com.assignment.task3;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char taskRepeat;
		int num1,num2,sum;
		
		do {
			System.out.println("Enter Number 1");
			num1 = scanner.nextInt();
			
			System.out.println("Enter Number 2");
			num2 = scanner.nextInt();
			
			sum = num1 + num2;
			
			System.out.println("Sum of "+num1+" & "+num2+" is "+sum);
			
			System.out.println("DO you want to repeat this task ? (Y/N)");
			taskRepeat = scanner.next().charAt(0);
			
			if(taskRepeat == 'N' || taskRepeat == 'n') {
				System.out.println("Task Terminate");
			}
			
			
			
		} while (taskRepeat == 'Y' || taskRepeat == 'y');
		
		

	}

}
