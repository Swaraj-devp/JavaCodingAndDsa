package com.nt.String;

public class S03ReverseStringSentenceSecondApproach {

	public static void main(String[] args) {

		String str = "Java is Awesome";

		String[] words = str.split(" ");

		for (String word : words) {

			char[] arr = word.toCharArray();

			int left = 0;
			int right = arr.length - 1;

			while (left < right) {

				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			}

			System.out.print(new String(arr) + " ");
		}
	}
}
