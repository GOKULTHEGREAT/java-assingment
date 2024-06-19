package com.ilpbatch4.utility;

public class Sumofseries2 {
	public static void main(String[] args) {
	int n=10, t=0, s=0, a=0;
		for(int i=1;i<n;i=i+2) {			
		if(t%2!=0) {
			a=-(i);
		}		
		else {
			a=i;
		}
			s=s+a;
			t++;
		}
		System.out.println(s);
		
	}
}
