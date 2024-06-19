package com.ilpbatch4.utility;

public class Missingnumber {
	public static void main(String[] args) {
		int[] a= new int []{1,2,3,4,5};
		int[] b= new int []{1,2,3};
		int l=0;
		for(int i=0;i<a.length;i++) {
			int f=0;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) 
					f=1;
			}
				if(f==0)
					System.out.println(a[i]);
			}
		}
	}

