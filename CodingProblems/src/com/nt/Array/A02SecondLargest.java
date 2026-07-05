package com.nt.Array;

public class A02SecondLargest {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,8};
		
		int largest = Integer.MIN_VALUE;
		
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i =0; i<arr.length;i++) {
			
			if(largest < arr[i]) {
				
				secondLargest = largest;
				
				largest = arr[i];
			}
			else if(secondLargest < arr[i] && largest > arr[i] ){
				
				secondLargest = arr[i];
			}
		}
		if (secondLargest == Integer.MIN_VALUE) {
		    System.out.println("Second largest element doesn't exist");
		} else {
		    System.out.println(secondLargest);
		}
	}
}
