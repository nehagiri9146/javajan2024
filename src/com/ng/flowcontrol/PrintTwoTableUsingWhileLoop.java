package com.ng.flowcontrol;

public class PrintTwoTableUsingWhileLoop {

	public static void main(String[] args) {
		
		int a=2;
		
		int i=1;
		
		int table=0;
		
		while(i<=10) {
			
			table=a*i;
			
			System.out.println(table);
			i++;
		}

	}

}
