package com.Basicjavaprograms;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		System.out.println("enter the number");
	
		int n=scn.nextInt();
		int a=1;
		if (n==0||n==1)
		{
			System.out.println(n+" is not a prime number because its less than 2 ");
		}
		for(int i=2;i<n;i++)
		{
			if (n%i==0)
		
		{
		a=0;
		break;
		}
			if (a==1)
			{
				System.out.println(n+" is not a prime number");
			}
			else {
				System.out.println(n+" is a prime number");
			}
			
		}
	}

}
