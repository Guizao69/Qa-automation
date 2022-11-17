package com.StringPrograms;

public class Stringbuilder1 {

	public static void main(String[] args) {
	String s="Java Developer";
	System.out.println("the reverse string is "+reversestring(s));
		
		
		

	}
	public static String reversestring(String s) {
		StringBuilder sb=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
			
		}
		return sb.toString();
		
	}

}
