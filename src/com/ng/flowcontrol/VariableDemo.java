package com.ng.flowcontrol;

public class VariableDemo {
	
	public static void main(String[] args) {
		
		int[]a= new int[5];
		
		a[0]=20;
		a[1]=10;
		a[2]=30;
		a[3]=50;
		a[4]=60;
		
		System.out.println(a[3]);  // 50
	}

}
