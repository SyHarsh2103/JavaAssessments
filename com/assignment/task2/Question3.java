package com.assignment.task2;

public class Question3 {
	public static void main(String[] args) {
		float dividend = 7;
		float divisor = 2;
		float quotient,reminder;
		System.out.println("Program to compute quotient and reminder.");
		System.out.println(dividend+"/"+divisor);
		
		
		quotient = dividend / divisor;
		reminder = dividend % divisor;
		System.out.println("Quotient - "+quotient);
		System.out.println("Reminder - "+reminder);
	}

}
