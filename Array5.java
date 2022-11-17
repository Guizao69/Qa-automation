package com.arrays;

public class Array5 {
//split method 
	public static void main(String[] args) {
		String s="Java Developer";
		String str="Java is a very Easy Language";
		System.out.println("The reverse string is "+reversestring(str));

		//o/p----avaj si yrev ysae egaugnaL
	//String [] s1=	s.split(" ");
	//for(String s2:s1) {
		//System.out.println(s2);
	//}
	}
	public static String reversestring(String str) {
		StringBuilder str1=new StringBuilder();
	for (int i=str.length()-1;i>0; i--)
    {
 
		str1.append(str.charAt(i));
		
		
		
    }
	return str1.toString();
	}
}
