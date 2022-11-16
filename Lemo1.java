package com.Program1;

public class Lemo1 {
	
	String value;
	Lemo1(String value){
		this.value=value;
	}
	public String toString() {
		return "value=" +value;
		
	}
	public static void main(String[] args) {
		
	
		Lemo1  l= new Lemo1("demo1");
		System.out.println(l.toString());
	}

}
