package com.StringPrograms;

public class String6 {
//count letter 1 by1 
	public static void main(String[] args) {
	
		String s="Java Developer";//14
		//jv developer 12 length a=2 times
	
	System.out.println	("Count of a:"+getcount(s,'a'));
	System.out.println	("Count of e:"+getcount(s,'e'));
	System.out.println	("Count of d:"+getcount(s,'D'));
	System.out.println	("Count of l:"+getcount(s,'l'));
	
	
	}
	
	
	
	public static int getcount(String s,char c) {

	return s.length()-s.replace(c+"","" ).length()	;
	
		
		
}
}