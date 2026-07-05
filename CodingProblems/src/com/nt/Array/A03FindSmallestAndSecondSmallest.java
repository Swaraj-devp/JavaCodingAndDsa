package com.nt.Array;

public class A03FindSmallestAndSecondSmallest {

	public static void main(String[] args) {

		int arr[] = {11};
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		
		for(int i =0; i<arr.length;i++) {
			
			if(smallest > arr[i]) {
				   secondSmallest = smallest;
				 smallest = arr[i];
			}
			else if(secondSmallest >arr[i] && smallest <arr[i] ) {
				secondSmallest = arr[i];
				
			}
		}
		
		System.out.println("Smallest :" + smallest);
		if(secondSmallest==Integer.MAX_VALUE){
		System.out.println(" No Second Smallest :");
		}
		else {
			System.out.println("  Second Smallest :" + secondSmallest);

		}
		
		
	}
}
