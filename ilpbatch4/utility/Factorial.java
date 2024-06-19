package com.ilpbatch4.utility;

public class Factorial {
	public static void main(String[] args) {
		int n=5;
		double s=0, a=1;
		
		for(int i=1;i<=n;i++) {
			a=a*i;
			s=s+(i/a);
		}
		System.out.println(s);
	}
}
