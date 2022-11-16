package com.Program1;

import com.Basicjavaprograms.Car;

public class Ferrari extends Car {
  public void start() {//method implementation
	  System.out.println("Ferrari starts");
  }
	
	
	public void music_system() {
		
		System.out.println("Music system of the car");
	
	}
	public static void main (String[] args) {
		Ferrari f=new Ferrari();//upcasting in java 
		f.start();//calling method
		if (f instanceof Ferrari) {//downcasting method storing sublcass into the same subclass
			
			Ferrari f1=(Ferrari)f;
			f1.music_system();
			//late binding 
		}
		
		
		
		
		//when a ovveridden method is called method implementation execute based on instance type 
	}  //
}
