package BasicProgramming;

import java.util.Scanner;

public class A04LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year to check leap or not");
		int year = sc.nextInt();
		
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + " is Leap year ");
		}else {
			
			System.out.println(year + " is not Leap year ");
		}
	}
}
