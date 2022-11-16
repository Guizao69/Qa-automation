package com.Program1;

public class Earlybinding extends Binding {

	
	public static void main(String[] args) {
		Binding b=new Earlybinding();
		b.m1();//compile connects at compile time
		b.m2();
		b.m3();
	}
	
}
