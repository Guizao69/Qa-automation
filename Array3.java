package com.arrays;

public class Array3 {
//getting the bigger number in a array
	public static void main(String[] args) {
		int []arr= {2,5,1,6,8,8,91,26,109,34,65,67,78};

		int bigger=0;//2,5,1,6,8 keep checking the condition of the array
		
		
		for (int a:arr) {
			if(bigger<a) {
				bigger=a;
			}
		}
		System.out.println("the biggest value in Array is " +bigger);
		
	}

}
