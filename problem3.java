package com.Solution;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a number ");
		int a=sc.nextInt();
		int b=a;
		
		if(a%2==0) {
			b=a-1;
			
		}
		for(int i=0;i<b;i++) {
			
			System.out.print(i*2+1);
			if(i<b-1) {
		
			System.out.print(", ");
		
			}
		}
		sc.close();
	}
}
