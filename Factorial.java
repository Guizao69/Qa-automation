package com.Basicjavaprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		System.out.println("enter the number");
	
		int a=scn.nextInt(); 
	
		
			int fact=1;
			
			for (int i=1;i<=a;i++)

			{
				fact=fact*i;
			}
			System.out.println("the factorial of "+a+" is "+fact);
	}
	}			


