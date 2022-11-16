package com.StringPrograms;

public class Stringprogram2 {
  public static void main(String[] args) {
	  String s1=new String("abcd");
	  String s2="abcd";
	  String s3="abcd";
	  
	  System.out.println(s1==s2);//this one is comparing the addresses
	  System.out.println(s1.equals(s2));//state of the object is equals
	  System.out.println(s2==s3);
	  System.out.println(s2.equals(s3));
	  //Memory 3 areas start area ,class area,heap area and inside heap there's  string pool area
	 
  }
  
}
