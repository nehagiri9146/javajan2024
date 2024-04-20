package com.ng.flowcontrol;

public class VariableDemo1 {
	
	public static void main(String []args) {
		
		int[]a= new int[6];
		 a[0]=35;
		 a[1]=10;
		 a[2]=30;
		 a[3]=22;
		 a[4]=50;
		 a[5]=45;
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);   // 35 10 30 22 50 45
		}
	}

}
