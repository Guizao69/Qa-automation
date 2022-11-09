package com.Basicjavaprograms;

public class Chain2 extends Chain1 {
//Constructor chaining in java thats why chain 1 is called in chain 2 (java adding super statement)
//1.implicit constructor chaining 
//2.explicit constructor chaining 	
	
	public Chain2() {
		super(39);//you have to call it in explicit 
		System.out.println("Chain 2 constructor");
	}
	
public Chain2 (String s) {
	System.out.println("chain 2 constructor s="+s);
}
public static void main (String[] args) {
	 Chain2 c=new Chain2();
}
}
