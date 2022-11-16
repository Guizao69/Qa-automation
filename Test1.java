package com.Program1;

public interface Test1  {
//type of interfaces
//Marker interface : it provide some information to Jre file execution
	//variables
	public static final String name = "depeesh";
	
	//Method in interface default,static,abstract
	abstract void m1();
	default void m2() {
		
	}
	static void m3(){
		
	}
	void m4();//abstract too
	
}
