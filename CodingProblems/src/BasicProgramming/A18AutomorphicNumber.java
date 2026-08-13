package BasicProgramming;

public class A18AutomorphicNumber {

	public static void main(String[] args) {

		int num = 25;

		int square = num * num;

		int temp = num;
		int divisor = 1;

		// Find 10^numberOfDigits
		while (temp != 0) {
			divisor *= 10;
			temp = temp / 10;
		}

		if (square % divisor == num) {
			System.out.println("Automorphic Number");
		} else {
			System.out.println("Not an Automorphic Number");
		}
	}
}
