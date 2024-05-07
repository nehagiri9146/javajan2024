package com.ng.oops;

public class ParentChildClient {
	
	public static void main(String[] args) {
		
		//case1
		
		Parent parent1 = new Parent();
	parent1.m1();
	
	// case2
	
	Child child1 = new Child();
	child1.m1();
	child1.m2();
	
	// case3
	
	Parent parent2 = new Child();
	parent2.m1();
	
	//parent2.m2(); // Not applicable
	
	// case4
	
	  //  Child1 child2 = new Parent1(); // not applicable
	}

}
