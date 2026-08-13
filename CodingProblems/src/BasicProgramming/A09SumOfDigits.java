package BasicProgramming;

public class A09SumOfDigits {

	public static void main(String[] args) {

		int num = 123456;

		int sum = 0;

		while (num != 0) {

			int digit = num % 10; // Extract last digit

			sum += digit;
			num = num / 10; // Remove last digit

		}
		System.out.println(sum);
	}

}
