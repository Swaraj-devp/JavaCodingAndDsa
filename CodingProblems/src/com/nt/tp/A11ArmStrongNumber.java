package com.nt.tp;

public class A11ArmStrongNumber {

	public static void main(String[] args) {

		int num = 153;

		int original = num;
		int armStrong = 0;

		while (num != 0) {

			int digit = num % 10;

			armStrong += digit * digit * digit;

			num = num / 10;

		}

		if (original == armStrong) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Not an ArmStrong");
		}
	}

}
