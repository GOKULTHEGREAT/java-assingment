package com.ilpbatch4.utility;
import java.util.Scanner;

public class Righttrianglestar {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of rows= ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j) 
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
 * 00	01	02	03
 * 10	11	12	12
 * 20	21	22	23	
 * 30	31	32	33
 * 
 */
