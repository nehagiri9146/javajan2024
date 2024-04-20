package com.ng.accessmodifier;

public class Test1 {
	
	int x = 10;
	static int y = 30;
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
		t1.x = 100;
		t1.y = 200;
		
		Test1 t2 = new Test1();
		
		System.out.println(t2.x+"  " +t2.y);
	}

}
