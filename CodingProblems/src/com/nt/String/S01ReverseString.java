package com.nt.String;

public class S01ReverseString {

	public static void main(String[] args) {
		
		String str = "Swaraj";
		
		char[] arr = str.toCharArray();
		
		int left = 0;
		int right = str.length()-1;
		
		while(left < right) {
			
			char temp = arr[left];
			
			arr[left] =arr[right];
			
			arr[right] = temp;
			
			left ++;
			right --;
		}
		
		System.out.print(new String(arr));
	}
}
