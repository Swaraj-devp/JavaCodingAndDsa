package com.nt.ArrayModule;

public class A06SecondLargestElement {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 5, 6, 7 };

		int max = Integer.MIN_VALUE;

		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {

			if (num > max) {
				secondLargest = max;
				max = num;
			} else if (secondLargest < num && max > num) {

				secondLargest = num;
			}

		}
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("Second largest element doesn't exist");
		} else {
			System.out.println("Second largest element : " + secondLargest);
		}
	}
}
