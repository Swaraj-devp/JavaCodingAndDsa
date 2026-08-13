package BasicProgramming;

public class A11SumOfEvenDigit {

	public static void main(String[] args) {
		
		int num = 12345;
		
		int evenSum =0;
		int oddSum=0;
		
		while(num!=0) {
			
			int digit = num % 10; // Extract last digit

			if (digit % 2 == 0) {
			    evenSum += digit;
			} else {
			    oddSum += digit;
			}
			num = num / 10; // Remove last digit 
		}
		System.out.println("Even Sum : "+evenSum +" , Odd Sum "+oddSum);
	}
}
