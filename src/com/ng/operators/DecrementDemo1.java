package com.ng.operators;

public class DecrementDemo1 {

	public static void main(String[] args) {
		
		int x=4; 
		System.out.println("The orginal value of x:" +x);
		System.out.println("After pre decrement.");
		
		int y= --x;
		System.out.println("The value of x:" +x+ "The value of y:" +y);
		
		int a=4;
		System.out.println("The orginal value of a:" +a);
		int b=a--;
		System.out.println("After post decrement.");
		System.out.println("The value of a:" +a+"The value of b:" +b);
		

	}

}
