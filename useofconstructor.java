package com.Basicjavaprograms;

public class useofconstructor {

	String name;
	int age;
	double sal;
	String Gender;
	
	//use of constructor to initialize non static variable 
	
	public useofconstructor(String n,int a, double s,String g) {
		
	name=n;
	age=a;
	sal=s;
	Gender=g;
	
	}
	
	public void display() {
		System.out.println("[Name:"+name+",Age:-"+age+",Salary:-"+sal+",Gender:-"+Gender+"]");
		
	}
	public static void main(String[] args) {
		
		useofconstructor u=new useofconstructor("josee",24,27773,"male");
		useofconstructor u1=new useofconstructor("zeina",27,27999,"female");
		u.display();
        u1.display();

	}

}
