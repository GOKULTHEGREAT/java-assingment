package com.ilpbatch4.utility;

public class numberarrangement {
	public static void main(String[] args) {
 int a=10, b=15, c=5;
	
	if(a<b && a<c) {
		if(b<c)
			System.out.println(a+", "+b+", "+c);
		else {
			System.out.println(a+", "+c+", "+b);
		}
	}
	else if(b<a && b<c ) {
		if(a<c)
			System.out.println(b+", "+a+", "+c);
		else
			System.out.println(b+", "+c+", "+a);
					
	}
	else {
		if(b<a)
			System.out.println(c+", "+b+", "+a);
		else
			System.out.println(c+", "+a+", "+b);
	}
	
	if(a>b && a>c) {
		if(b>c)
			System.out.println(a+", "+b+", "+c);
		else {
			System.out.println(a+", "+c+", "+b);
		}
	}
	else if(b>a && b>c ) {
		if(a>c)
			System.out.println(b+", "+a+", "+c);
		else
			System.out.println(b+", "+c+", "+a);
					
	}
	else {
		if(b>a)
			System.out.println(c+", "+b+", "+a);
		else
			System.out.println(c+", "+a+", "+b);
	}
	
	}
	
}