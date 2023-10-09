package com.tnsif.abstraction;
//program to demonstrate abstraction in java
//abstract class
public abstract class shape {
	protected float area;
	//abstract method
		abstract void calArea();
		
		void Show() {
		System.out.println("area of shape:" +area);
		}
}
