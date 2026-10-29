package com.nt.tp;

public class A12GCD {

	public static void main(String[] args) {

		int a = 12;
		int b = 18;
		int temp =0;
		for (int i = 1; i <= b; i++) {

			
			if (a % i == 0 && b % i == 0) {
				temp =i;
			}
		}
		System.out.println("GCD: "+ temp);
	}
}
