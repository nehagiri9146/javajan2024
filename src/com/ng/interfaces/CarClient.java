package com.ng.interfaces;

public class CarClient {
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Car();
		
		int wheelsCount = vehicle.getNumberOfWheels();
		
		System.out.println(wheelsCount);
	}

}
