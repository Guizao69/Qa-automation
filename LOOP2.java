package com.Basicjavaprograms;
import java.util.Scanner;

public class LOOP2 {

	public static void main(String[] args) {
		//syntax
		Scanner scn = new Scanner(System.in);
		
			System.out.println("enter the age");
		
			int age=scn.nextInt();
			//do while
			do {
				System.out.println("eligible to vote");
			}while(age>=18);
			
	}

}
