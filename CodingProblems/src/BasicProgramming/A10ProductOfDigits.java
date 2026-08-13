package BasicProgramming;

public class A10ProductOfDigits {

	public static void main(String[] args) {
		int num = 1234;

		int product = 1;

		while (num != 0) {

			int digit = num % 10; // Extract last digit

			product *= digit;
			num = num / 10; // Remove last digit

		}
		System.out.println(product);
	}
	
}
