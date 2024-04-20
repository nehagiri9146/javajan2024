package com.ng.flowcontrol;

public class UseBreakLabelBlock {
	
	public static void main(String[]args) {
	
	int i=10;
	
	l1:
	{
		System.out.println("Hello");
		if(i==10) {
			break l1;
			}
		System.out.println("Hi");
		}
	System.out.println("End");
	}		

}
