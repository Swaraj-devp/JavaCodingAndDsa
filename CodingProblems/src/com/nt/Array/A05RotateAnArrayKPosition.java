package com.nt.Array;

public class A05RotateAnArrayKPosition {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int k = 3;

		k = k % arr.length;

		// Reverse the entire array

		reverse(arr, 0, arr.length - 1);

		// reverse first k element;
		reverse(arr, 0, k - 1);

		// Step 3: Reverse remaining elements
		reverse(arr, k, arr.length - 1);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	private static void reverse(int[] arr, int left, int right) {

		while (left < right) {

			int temp = arr[left];

			arr[left] = arr[right];

			arr[right] = temp;

			left++;

			right--;
		}

	}
}
