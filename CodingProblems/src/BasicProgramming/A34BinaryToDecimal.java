package BasicProgramming;

public class A34BinaryToDecimal {

	public static void main(String[] args) {

		int binary = 1111;

		int decimal = 0;
		int power = 0;

		while (binary != 0) {

			int digit = binary % 10;

			decimal = decimal + digit * (int) Math.pow(2, power);

			binary = binary / 10;

			power++;
		}

		System.out.println("Decimal = " + decimal);
	}

}
