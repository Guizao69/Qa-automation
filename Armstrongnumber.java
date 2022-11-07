package com.Basicjavaprograms;

import java.util.Scanner;
public class Armstrongnumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		System.out.println("enter the number");
	
		int n=scn.nextInt();//variable to check 
		int sum=0;
		int a=n;
		
		while (n>0) {
			int r =n%10;//remainder
			sum=sum+(r*r*r);
			n=n/10;
			
			
		}
		if (sum==a)
			
			System.out.println(""+a+" is an armstrong number");
	
		else
			
			System.out.println(""+a+" is not an armstrong number");
		
		}
		

	}

