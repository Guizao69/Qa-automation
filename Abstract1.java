package com.Program1;

public  class Abstract1 extends Abstraction {

	public static void main(String[] args) {
Abstraction a=new Abstract1();
a.start();

	}

	@Override
	void start() {
		System.out.println("start in abstraction");
	}
	
	@Override
	void stop() {
		
	}
}
