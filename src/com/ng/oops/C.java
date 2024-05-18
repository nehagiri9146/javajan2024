package com.ng.oops;
                    //example of method hiding
public class C extends P {
	
	public static void m1() {
		System.out.println("Child static m1 method");
	}


public static void main(String[] args) {
	P p1 = new P();
	p1.m1();
	
	C c1 = new C();
	c1.m1();
	
	P p2 = new C();
	p2.m1();
}
}
