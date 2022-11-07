package com.Basicjavaprograms;

public class Forloop9complex {

	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)//rows
		{
			for (int j=5;j>i;j--)//columns
			{
				System.out.print(" ");
				
				
			}
			
		for (int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
			}
		}
	}

