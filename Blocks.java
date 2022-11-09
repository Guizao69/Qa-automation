package com.Basicjavaprograms;

public class Blocks {
static int a; 
int b;
	//Blocks in java
	//1.static block or static initialisation block (class)
	//2.non static block(instance)
	public Blocks(){
		System.out.println("default constructor");
	}
	static
	{
		a=272;
		System.out.println("static block a="+a);
	}
	
	{
		b=262;
		System.out.println("non static block 1");
	}
	
	
	
	
	public static void main(String[] args) {
		
	
		System.out.println("Main starts");
		Blocks b=new Blocks();
		Blocks b1=new Blocks();
		System.out.println(b.b);
		System.out.println("Main ends");
	}
	 
	

}
