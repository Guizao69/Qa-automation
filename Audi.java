package com.Basicjavaprograms;

public class Audi extends Car {
//Method overiding in java overiding the super class in subclass method based on requirement 
	protected void start() {
		System.out.println("Audi car starts sucessfully");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Audi a=new Audi();
		a.start();
		a.Break();
	}

}
