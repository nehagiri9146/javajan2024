package com.ng.flowcontrol;

public class NoPyramidUsingForLoop {
	
	public static void main(String[] args) {
		
		for(int i=1;i<6; i++) { 
			
			for(int j=1; j<=i; j++) { 
				
				System.out.print(i);
				
			}
			System.out.println();
		}
	}

}
