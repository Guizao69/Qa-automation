package com.Program1;

public class Address {
String state;
String city;
String country;

public Address(String state,String city,String country) {
	this.city=city;
	this.country=country;
	this.state=state;
}


public String display() {
	return"[Country="+country+",State="+state+"city="+city+"]";
}
}
