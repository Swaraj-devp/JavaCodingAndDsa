package BasicProgramming;

import java.util.Scanner;

public class A02CheckNumber {
// Check whether given number is positive negative or zero
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if (num > 0) {
		    System.out.println("Positive Number");
		} else if (num < 0) {
		    System.out.println("Negative Number");
		} else {
		    System.out.println("Zero");
		}
	}
	
}
