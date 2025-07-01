package com.Solution;

import java.util.Scanner;

public class Problem1 {
	public double operation( double a,double b,String operation) {
		switch (operation.toLowerCase()) {
		case "add":
				return a+b;
		case "substract":
			return a-b;
		case "multiply":
			 return a*b;
		case "divide":
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
			 return a/b;
			
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + operation);
		}
		
	}
	

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First NUmber");
		double a= sc.nextDouble();
		System.out.println("Enter Second NUmber");
		double b= sc.nextDouble();
		System.out.println("Enter Operation like (add/substract/ multiply/divide");
		String   operation= sc.next();
		Problem1 p=new Problem1();
		double result=p.operation(a, b, operation);
		if (!Double.isNaN(result)) {
			
		
		System.out.println(result);
		}
		
		 

	}

}
