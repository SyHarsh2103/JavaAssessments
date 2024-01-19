package com.assignment.task2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Calculator");
		System.out.println("OPtions");
		System.out.println("-------------------------------");
		System.out.println("1.Addition[+]");
		System.out.println("2.Subtraction[-]");
		System.out.println("3.Multiplication[*]");
		System.out.println("4.Division[/]");
		System.out.println("-------------------------------");
		
		
		System.out.println("Enter Number 1");
		float num1 = scanner.nextFloat();
		
		System.out.println("Enter Number 2");
		float num2 = scanner.nextFloat();
		
		System.out.println("Enter your choice by selecting sign");
		char choice = scanner.next().charAt(0);
		
		float answer;
		
		switch (choice) {
		case '+':
			System.out.println("Addition");
			answer = num1 + num2;
			System.out.println(num1+" + "+num2+" = "+answer);
			break;
		case '-':
			System.out.println("Subtraction");
			answer = num1 - num2;
			System.out.println(num1+" - "+num2+" = "+answer);
			break;
		case '*':
			System.out.println("Multiplication");
			answer = num1 * num2;
			System.out.println(num1+" * "+num2+" = "+answer);
			break;
		case '/':
			System.out.println("Division");
			answer = num1 / num2;
			System.out.println(num1+" / "+num2+" = "+answer);
			break;
		default:
			System.out.println("Sorry incorrect choice");
			break;
		}

	}

}
