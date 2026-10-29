
package com.nt.tp;

public class A09CountOfDigits {

	public static void main(String[] args) {
		
		int num =12345;
		
		int count=0;
		while(num!=0) {

           int digit =num%10;
           count ++;
           num =num/10;
		}
		System.out.println(count);
	}
}
