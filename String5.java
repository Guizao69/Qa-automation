package com.StringPrograms;

public class String5 {
//count unique characateres how many times represent
	public static void main(String[] args) {
		String s="Java Developer";
		String s1="";
	
		//o/p-----Distinct letter Jav devlopr not the repeated characteres
		
		for (int i=0;i<s.length();i++)
		{
		char c=	s.charAt(i);
		if (s1.indexOf(c)==-1) {
			s1=s1+c;
			
		}
		
		}
		System.out.println("Unique characters:"+s1);
	}
	

}
