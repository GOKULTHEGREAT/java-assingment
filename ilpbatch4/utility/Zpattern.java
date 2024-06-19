package com.ilpbatch4.utility;

public class Zpattern {
	public static void main(String[] args){
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && (j%2!=0)) || i==(n-1)&& ((j%2)!=0)|| i+j==(n-1) && ((j%2)!=0))
					System.out.print("*");
				else if((i==0) || i==(n-1) || i+j==(n-1))
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
