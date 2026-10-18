package com.nt.ArrayModule;

public class A09CopyArray {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		
		int arr2[]= new int[arr.length];
		
		for(int i =0; i <=arr.length-1;i++) {
			
			arr2[i]=arr[i];
		}
		
		for(int num :arr2) {
			System.out.print( num+",");
		}
	}
}
