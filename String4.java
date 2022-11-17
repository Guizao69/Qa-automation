package com.StringPrograms;

public class String4 {
//getting the index of the character
	public static void main(String[] args) {
		String s="Java Developer";
	    int count=0;
	 s = s.toLowerCase();
		//o  p----- get the vowels
		for(int i=0; i<s.length(); i++) {
	         if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'|| s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
	            System.out.println("Given string contains "+s.charAt(i)+" at the index "+i);
	         }
	         }
		//counting of the vowels
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'|| s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				 System.out.println("Total no of vowels in string are: " + count);
				 count++;
			}
				            
		
	
		
	}
	}
}

	

	     	//int n=s.indexOf('D');
	     	//	System.out.println(n);
	     		//System.out.println(s.indexOf('e'));
	     //System.out.println(s.lastIndexOf('e'));
	     //System.out.println(s.indexOf('b'));
	     	