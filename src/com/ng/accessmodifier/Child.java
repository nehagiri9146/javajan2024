package com.ng.accessmodifier;

public class Child extends Parent{
	
	@Override
	public void property() {
		
		System.out.println("Money, Gold, Land and mutualfund");
		
	}
	public static void main(String[]args) {
		
		Parent parent1=new Parent();
		
		parent1.property();
		
		Child child1=new Child();
		
		child1.property();
		
		Parent parent2 = new Child();
		
		parent2.property();
	}

}
