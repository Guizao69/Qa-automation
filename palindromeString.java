package com.StringPrograms;

public class palindromeString {

	public static void main(String[] args) {
String s="Madam";
boolean status=isPallindrome(s);
if (status) {
	System.out.println("String "+s+" is a pallindrome");
}else {
	System.out.println("String"+s+" is not a pallindrome");
}

	}
	
	
	
	
	public static boolean isPallindrome(String s) {
		
		s=s.toLowerCase();//madam
		for (int i=0;i<s.length()/2;i++) {
			
		if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
			return false;
		}
		
		
		}
		return true;
	}

}
