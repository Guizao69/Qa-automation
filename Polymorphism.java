package com.Program1;

public class Polymorphism {

	//Poly -- many
	//morphism--forms
	
	//1.Compile time polymorphism or static poly
	
	//overloading same name different parameters
	  
	
	//2.run time polymorphism dynamic polymorphism ---inheritance,overididng upcasting )
	
	
public int add(int i) {
	
	return i+10 ;
}
	public int add(int i,int j)
	{
		return i+j;
	}
	public int add(int i,int j,int k)
	{
		return i+j+k;
	}
	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
		System.out.println(p.add(2,3));
		System.out.println(p.add(2,3,4));
		System.out.println(p.add(23));
		
	}
}
