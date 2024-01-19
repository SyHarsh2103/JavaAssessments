package com.assignment.task2;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your salary");
		double salary = scanner.nextDouble();
		double hra = 0,da = 0;
		if(salary <= 15000) {
			hra = 0.25 * salary;
			da = 0.82 * salary;
		}
		else if(salary > 15000 && salary <= 20200) {
			hra = 0.27 * salary;
			da = 0.9 * salary;
		}
		else if(salary > 20200) {
			hra = 0.36 * salary;
			da = 0.95 * salary;
		}
		
		double gross_salary = salary + hra + da;
		
		System.out.println("Gross Salary - "+gross_salary);
		
		
		
		
		
	}

}
