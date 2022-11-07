package com.Basicjavaprograms;

public class Testjava {
    //1.Variable
	//2.Method
	//3.Constructor(special type of method )
	//default constructor without any parameter
Testjava () {
	
	System.out.println("Test java class constructor");
	
}//each time an object is created Test java constructor will be executed

//Parametrized constructor 
Testjava (String name) {
	
	System.out.println("name="+name);
}

	public static void main(String[] args) {
		Testjava t=new Testjava();
		Testjava t1=new Testjava();
		Testjava  t2=new Testjava("deepesh");

	}

}
