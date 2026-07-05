package com.nt.String;

public class S05PalindromeString {

	public static void main(String[] args) {

		String str = "cat";

		int left = 0;
		int right = str.length() - 1;

		boolean isPalindromeString = true;
		while (left < right) {

			if (str.charAt(left) != str.charAt(right)) {

				isPalindromeString = false;
				break;
			}
			left++;
			right--;
		}
		if (isPalindromeString) {
			System.out.println("String is a Palindrome");
		} else {
			System.out.println("String is Not a Palindrome");
		}
	}
}
