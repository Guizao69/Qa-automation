package com.StringPrograms;

public class String3 {

	public static void main(String[] args) {
		
		String s1="Java Developer";
		String s2="";
	int n=s1.length();//length of the string 
	System.out.println(n);
	System.out.println(s1.charAt(5));
	// return each character by its char value
	for(int i=n-1;i>=0;i--) {//loop for couting each character
		char c=s1.charAt(i);
		s2=s2+c;
		System.out.println(s2);//reverse string count
		/*
		for(int i=0;i<n;i++) {//normal string count
			char c=s1.charAt(i);
			System.out.println(c);
			/*
			 *
			 */
		}
	}
		
	}

}
