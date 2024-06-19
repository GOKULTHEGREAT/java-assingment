package com.ilpbatch4.utility;

public class Sumofpairs {
	public static void main(String[] args){
		int n=5, k=7, f=0;
		int [] arr= new int [20];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		for(int i=0;i<n;i++) {
		    for(int j=i+1;j<n;j++){
			    if(arr[i]+arr[j]==k) {
			    	
			    	System.out.println(arr[i]+", "+arr[j]);
			    }
			
		}	
	}
	}
}