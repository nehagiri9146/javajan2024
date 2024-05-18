package com.ng.oops;

public class MoreSpecificOverloading {

	public void m1(StringBuffer sb) {
		
		System.out.println("StringBuffer Version");
		
	}
	public void m1(String s) {
		
		System.out.println("String version");
	}
}
