package com.nt.ArrayModule;

public class A04LargestElementOfArray {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50,42};
		
		int max = arr[0];
		
		for(int num :arr) {
			
			if(max <= num) {
				max = num;
				
			}
			
		}
		System.out.println("Largest Element of Array is:  "+ max);
		
	}
}
