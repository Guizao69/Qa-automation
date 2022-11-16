package com.Program1;

 public class keyword1 {

	//final modifier cannot change the value 
	public static final int a=272838; 
	
	
	public static final  void  Method123() {
		System.out.println("Method123");
	}
	
	
	public static void main(String[] args) {
		System.out.println("a="+a);
		Method123();
		System.out.println("a="+a);
	}
	

}//if a class is final we cannot extend ,only final function can be inherited