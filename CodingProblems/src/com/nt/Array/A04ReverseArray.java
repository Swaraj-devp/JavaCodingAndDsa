package com.nt.Array;

public class A04ReverseArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		
		int left =0;
		int right =arr.length-1;
		
		int temp =0;
		
		while(left < right) {
			
			temp = arr[right];
			arr[right]= arr[left];
			arr[left] =temp;
			
			left++;
			right --;
			
		}
		
		for(int num : arr) {
			System.out.print(num +" ");
		}
		
	}
	
	
}
