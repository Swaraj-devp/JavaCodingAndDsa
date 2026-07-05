package com.nt.String;

public class S02ReverseStringSentence {

	public static void main(String[] args) {

		String str = "Java is Awesome";

		String[] words = str.split(" ");

		int left = 0;

		int right = words.length - 1;

		while (left < right) {

			String word = words[left];

			words[left] = words[right];

			words[right] = word;

			left++;

			right--;
		}

		for (String word : words) {

			System.out.print(word + " ");
		}

	}
}
