package com.assignment.task3;

public class Question9 {
public static void main(String[] args) {
	int n = 5,i,j;
	
	 for (i = 1; i <= n; i++) {
        
         for (j = 1; j <= n - i; j++) {
             System.out.print(" ");
         }
       
         for (j = 1; j <= 2 * i - 1; j++) {
             if (j == 1 || j == 2*i-1)
                 System.out.print("*");
             else
                 System.out.print(" ");
         }
         System.out.println();
     }

  
     for (i = n-1; i >= 1; i--) {
      
         for (j = 1; j <= n - i; j++) {
             System.out.print(" ");
         }
         // inner loop to print stars
         for (j = 1; j <= 2 * i - 1; j++) {
             if (j == 1 || j == 2*i-1)
                 System.out.print("*");
             else
                 System.out.print(" ");
         }
         System.out.println();
     }
}
}
