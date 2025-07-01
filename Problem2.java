package com.Solution;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner (System.in);
		System.err.println("enter a number");
		int a=sc.nextInt();
		
		
		for(int i =1;i<=a;i++) {
			System.out.print(2*i-1);
			if(i<a) {
				
			System.out.print(",");
			
			}
		}
			
		}
	}
	


