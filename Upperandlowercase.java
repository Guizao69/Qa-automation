package com.StringPrograms;

public class Upperandlowercase {

	public static void main(String[] args) {
		
		String s="Java Developer";
		//o/p------jAVA dEVELOPER
		System.out.println("Case changed="+changecase(s));
		
		
	}
	
	public static String changecase(String s) {
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<s.length();i++) {
		char c=s.charAt(i);
			if(c>='A'&& c<='Z') {
				sb.append(Character.toLowerCase(c));
				
			}else if (c>='a'&& c>='z') {
				sb.append(Character.toUpperCase(c));
			}else {
				sb.append("");
			}
		}
		return sb.toString();	
		}

}
