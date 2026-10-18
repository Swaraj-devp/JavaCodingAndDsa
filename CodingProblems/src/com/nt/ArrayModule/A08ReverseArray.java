package com.nt.ArrayModule;

public class A08ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };

		int start = 0;

		int end = arr.length - 1;

		int temp = 0;
		while (start < end) {

			temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;

			start++;
			end--;

		}
		for(int num : arr) {
			System.out.print(num +" ");
		}

	}
}
