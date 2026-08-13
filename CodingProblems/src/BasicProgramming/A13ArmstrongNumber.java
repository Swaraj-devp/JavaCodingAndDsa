package BasicProgramming;

public class A13ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 123;
		
		int sum  = 0;
		int original = num;
		
		while(num!=0) {
			
			int digit = num%10;
			System.out.println(" current digit" +digit);
			sum += digit*digit*digit;
			System.out.println("Current Digit SUM"+ sum);
			
			num=num/10;
		}
		
		if(sum==original) {
			
			System.out.println("Number is Armstrong Number");
		}else {
			System.out.println("Number is not Armstrong Number");
		}
	}
}
