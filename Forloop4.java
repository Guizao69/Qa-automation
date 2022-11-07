package com.Basicjavaprograms;

public class Forloop4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)//rows
		{
			for(int j=1;j<=5;j++) //columns
			{
				System.out.print((char)(i+64));
			}
			
			System.out.println("");
		}
		}
}	