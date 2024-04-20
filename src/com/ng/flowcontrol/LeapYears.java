package com.ng.flowcontrol;

public class LeapYears {
	
	public static void main(String [] args) {
		
		int year=2024;
		
		if(year%100==0){
			if(year%400==0){
				
		System.out.println("Leap year");		
			} else {
				
		System.out.println("NOT leap years");		
			}
		}else {
			if(year%4==0) {
				
		System.out.println("Leap year");
		
			}else {
				
			System.out.println("Not leap year");	
			}
			
		}
		
	}

}
