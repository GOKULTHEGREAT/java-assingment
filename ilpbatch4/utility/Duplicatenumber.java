package com.ilpbatch4.utility;

public class Duplicatenumber {
	public static void main(String[] args) {
		int [] arr= new int [20];
		int f=0, l=0;
		arr[0]=1;
		arr[1]=2;
		arr[2]=2;
		arr[3]=3;
		arr[4]=4;
		for(int i=0;i<5;i++) {
			f=0;
			for(int j=1;j<5;j++) {
				if(arr[i]==arr[j])
					f++;
				if(f>1) {
					l=arr[i];
				}
			}
		}
		System.out.println(l);
	}
}
