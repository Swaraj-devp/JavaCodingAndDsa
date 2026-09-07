package com.nt.patternprogramming;

public class A04InvertedRightAngleTriangle {

	public static void main(String[] args) {
		
		int n =5;
		
		for(int i=1; i<=n ;i++) {
			
			for(int j=i;j<=n;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
