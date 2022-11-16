package com.Program1;



public class Encapsulation1 {

	
	
	
	private String name;
	
	
	public String getter()
	{
		return name;
	}
	public void setter(String name ) {
		this.name=name;
	}
	
	public static void main(String[] args) {
Encapsulation1 e=new Encapsulation1();
		e.setter("deppesh");
		System.out.println(e.getter());
		
	//encapsulation in java	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
