package BasicProgramming;

public class A15PerfectNumber {

	public static void main(String[] args) {

		int num = 28;
		int sum = 0;

		for (int i = 1; i < num; i++) {

			if (num % i == 0) {
				sum += i;
			}
		}

		if (sum == num) {
			System.out.println("Number is Perfect Number");
		} else {
			System.out.println("Number is not Perfect Number");
		}
	}

}
