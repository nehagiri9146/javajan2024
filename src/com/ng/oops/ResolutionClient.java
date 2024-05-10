package com.ng.oops;

public class ResolutionClient {
	
 public static void main(String[] args) {
	 
	 ResolutionDemo resolutionDemo = new ResolutionDemo();
	
	 resolutionDemo.m1(new Object());
	 resolutionDemo.m1("Sanjay");
	 resolutionDemo.m1(null); // method resolution child argument will get more priority
}
}
