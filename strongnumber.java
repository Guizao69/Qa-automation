package com.Basicjavaprograms;

import java.util.Scanner;

public class strongnumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		System.out.println("enter the number");
	
		int n=scn.nextInt();
		int sum=0;
		int a=n;
		int fact=1;
		
		for (int i=1;i<=n;i++)

		{
			fact=fact*i;
		}
		while (n>0) {
			int r =n%10;//remainder
			sum=sum+fact;
			n=n/10;
		}		
	if (sum==n)
		
	System.out.println(" "+a+" is a strong number");
	
	else 
		
		System.out.println(" "+a+" is not a strong number");
	}
	
}
	
