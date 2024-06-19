package com.ilpbatch4.utility;

public class Rectpatern {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<(2*n-1);i++) {
			for(int j=0;j<(2*n-1);j++) {
				if(i==0||j==0 || i==(2*n-2) || j==(2*n-2))
					System.out.print(n);
				else if(i==1||j==1|| j==3 || i==(2*n-3) || j==(2*n-3) ) 
					System.out.print(3);
				
				else if(i==2||j==2||j==2 || i==(2*n-4) || j==(2*n-4)) 
					System.out.print(2);
	
				else 
					System.out.print(1);
				
			}
			System.out.println();
		}
	}

}
