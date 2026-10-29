package com.nt.tp;

public class A04PalindromeNumber {

	public static void main(String[] args) {

		int num = 123321;
		int reverse = 0;
		int original = num;

		while (num != 0) {
			int digit = num % 10;

			reverse = reverse * 10 + digit;

			num = num / 10;

		}
		if (reverse == original) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Not Palindroome");
		}
	}
}
