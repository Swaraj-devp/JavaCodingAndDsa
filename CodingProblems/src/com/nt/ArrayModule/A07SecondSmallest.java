package com.nt.ArrayModule;

public class A07SecondSmallest {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int min = Integer.MAX_VALUE;

		int secondSmallest = Integer.MAX_VALUE;

		for (int num : arr) {
			if (min > num) {

				secondSmallest = min;
				min = num;

			} else if (secondSmallest > num && min < num) {
				secondSmallest = num;
			}
		}
		System.out.println("Second Smallest Number : " + secondSmallest);
	}
}
