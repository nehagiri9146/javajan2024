package com.ng.flowcontrol;

public class ProductOfDigits {

	public static void main(String[] args) {
		
		int num=253;
		int product=1;
		int rem=0;
		while(num>0) {
			
			rem=num%10;  //253%10=3 , 25%10=5 ,2%10=2
			
			product=product*rem;  //1*3=3 , 3*5=15 , 15*2=30...total value 
			
			num=num/10;  //253/10=25 , 25/10=2 , 2/10=0 ...condition is false while loop exit
			
		}
		System.out.println( product);
	}

}
