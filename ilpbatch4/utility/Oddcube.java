package com.ilpbatch4.utility;

public class Oddcube {
	public static void main(String[] args) {
		int n=3, a=0, t=0;
		double s=0;
		for(int i=1;i<n;i=i+2) {
			if(t%2!=0) {
					a=-(i);
				}		
				else {
					a=i;
				}
		for(int j=1;j<n;j++) {
				s=s+Math.pow(i,j);	
			}
		t++;
		}
		System.out.println(s);
	
		}
	}


