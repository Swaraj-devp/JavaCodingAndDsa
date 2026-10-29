package com.nt.tp;

public class A05PrimeNumber {

	public static void main(String[] args) {
		 int num =7;
		 
		 boolean isPrime = true;
		 if(num <=1) {
			 isPrime =false;
		 }
		 
		 for(int i =2 ; i<=num /i ;i++) {
			 
			 if(num%i==0) {
				 isPrime =false;
				 break;
			 }
			 
		 }
		 if(isPrime) {
			 System.out.println("Number is Prime Number");
		 }else {
			 System.out.println("Number is not prime number");
		 }
	}
}
