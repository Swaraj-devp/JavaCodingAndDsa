package com.nt.ArrayModule;

public class A05FindSmallestElement {

	public static void main(String[] args) {

		int arr[] = { 10, 23, 4, 3, 54, 45 };

		int smallest = arr[0];

		for (int num : arr) {

			if (smallest > num) {
				smallest = num;
			}
		}
		System.out.println("Smallest ELement of Array: " + smallest);

	}
}
