package com.Program1;
//Aggregation in java
public class Student {
String name;
int age;
String subject;
Address adr;
public Student(String name,int age,String subject, Address adr) {
	this.name=name;
	this.age=age;
	this.subject=subject;
	this.adr=adr;
}
public void display() {
	System.out.println("[Name="+name+",Age="+age+",subject="+subject+"]" );
	System.out.println(adr.display());
}
}
