package com.Basicjavaprograms;

public class createanobject {
//data members
//not static variable
	 int a;
	 double s;
	//to be called those variables we need an object
	
	

	public static void main(String[] args) {
	//state-value(Variable) behavior-functionality (method)
	
	//syntax to create an object
	
		createanobject co=new createanobject();
		System.out.println(co.a);
		System.out.println(co.s);
		co.a=27375;
		co.s=9999.67;
		
	
		System.out.println(co.a);
		System.out.println(co.s);
	
	
	
	}
	
	
	

}


