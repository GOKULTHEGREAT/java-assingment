package com.ilpbatch4.utility;
import java.util.Scanner;

public class Diamondpattern {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int n = scanner.nextInt();

	        for (int i=1;i<=(2*n)-1;i++) {
	            int a = Math.abs(n-i);
	            int b = n-a;
	         
	            for (int j=0;j<a;j++) {
	                System.out.print(" ");
	            }
	          
	            for (int j=b;j>=1;j--) {
	                System.out.print(j);
	            }
	            for (int j=2;j<=b;j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }
	}