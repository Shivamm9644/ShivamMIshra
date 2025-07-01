package com.Solution;

public class problam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
		int []count=new int[10];
		 for(int i=0;i<arr.length;i++) {
			 int num=arr[i];
			 for(int j=1;j<=9;j++) {
				 if(num%j==0) {
					 count[j]++;
				 }
			 }
				 
		 }
		 for(int i=0;i<=9;i++) {
			 System.out.println(i+":"+count[i]);
			 
		 }
	}

}
