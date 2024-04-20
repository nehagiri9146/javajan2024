package com.ng.interfaces;

public class MyClass implements MyInterface{

	@Override
	public void wish() {
		System.out.println("Hii good morning all!!!");
		}
	
	public static void main(String[] args) {
		
		MyClass myClass = new MyClass();
		
		myClass.wish();
	}
}
