package com.nt.String;

public class S06PalindromeIgnoringSpecialCharacters {

	public static void main(String[] args) {

		String str = "A man, a plan, a canal: Panama";

		int left = 0;
		int right = str.length() - 1;

		boolean isPalindrome = true;

		while (left < right) {

			// Skip special characters from left
			if (!Character.isLetterOrDigit(str.charAt(left))) {
				left++;
				continue;
			}

			// Skip special characters from right
			if (!Character.isLetterOrDigit(str.charAt(right))) {
				right--;
				continue;
			}

			// Compare ignoring case
			if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {

				isPalindrome = false;
				break;
			}

			left++;
			right--;
		}

		if (isPalindrome) {
			System.out.println("String is a Palindrome");
		} else {
			System.out.println("String is Not a Palindrome");
		}
	}
}