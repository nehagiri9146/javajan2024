package com.ng.flowcontrol;

public class ProductOfDigitsDemo3 {
	
	public static void main(String[] args) {
		
	int num=3684;
	int product=1;
	int rem=0;
	
	while(num>0) {
		
		rem=num%10;
		product=product*rem;
		num=num/10;
	}
	System.out.println(product);
	}

}
