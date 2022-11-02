package com.Basicjavaprograms;

import java.util.Scanner;

public class LOOP1 {

	public static void main(String[] args) 
	{
		try (//1.Loop statement
				//while loop
				//syntax
		Scanner scn = new Scanner(System.in)) {
			System.out.println("enter the age");
		
			int age=scn.nextInt();
			
			while(age>=18) 
			{
				
				System.out.println("Eligible to vote...");
				
			age--;
			}
		}
		}
		
	}
