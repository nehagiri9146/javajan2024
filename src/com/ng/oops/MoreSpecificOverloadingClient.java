package com.ng.oops;

public class MoreSpecificOverloadingClient {

	public static void main(String[] args) {
		
		MoreSpecificOverloading mso = new MoreSpecificOverloading();
		
		mso.m1(new StringBuffer("Anil"));
		mso.m1("Anil");
		// mso.m1(null); // Not Applicable
	}
}
