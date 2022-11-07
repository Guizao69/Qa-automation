package com.Basicjavaprograms;

import java.util.Scanner;

public class Pallindromenumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		System.out.println("enter the number");
	
		int n=scn.nextInt();//variable to check
		int a=n;
		int sum=0;
	
		
		while (n>0) {
			
			int r=n%10;//getting the remainder
			sum=sum*10+r;
			n=n/10;
			
		}
		if(a==sum)	
			System.out.println(" "+a+" is a palindrome number");
		else 
			
			System.out.println(" "+a+" is not a palindrome number");
		}
		}
		
		
			

	

