package com.nt.patternprogramming;

public class A16PascalTriangle {

	public static void main(String[] args) {

		int n = 5;
		
		for (int i = 1; i <= n; i++) {

			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			int num = 1;
			for (int k = 1; k <= i; k++) {
				 System.out.print(num + " ");

	                num = num * (i - k) / k;
	            }

			System.out.println();
		}
	}
}
