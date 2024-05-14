package com.ng.oops;
                    // Overriding 4th point
public class ChildSample extends ParentDemo {
	public void method1()throws Exception{
		
		System.out.println("Method-1 of the ChildSample class is executed.");
	}
	
	public void method2() {
		
		System.out.println("Method-2 of the ChildSample class is executed."); 
	}
	public static void main(String[] args)throws Exception {
      
		ParentDemo pd1 = new ParentDemo();
		ParentDemo pd2 = new ChildSample();
		pd1.method1();
		pd2.method1();
		pd1.method2();
		pd2.method2();
	}

}
