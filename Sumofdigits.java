package com.Basicjavaprograms;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		System.out.println("enter the number");
	
		int n=scn.nextInt();//36635
		int a=n;
		int sum=0;//5
		while(n>1) {
			int r =n%10;
			sum=sum+r;
			n=n/10;
			
		}
		System.out.println("the sum of digits of "+a+" is " +sum);
		}
	

	}

