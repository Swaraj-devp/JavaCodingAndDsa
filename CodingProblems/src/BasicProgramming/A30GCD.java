package BasicProgramming;

public class A30GCD {

	public static void main(String[] args) {
		int a = 12;
		int b = 18;

		int min = Math.min(a, b);
		
		int gcd=0;

		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd=i;			}
		}
		System.out.println(gcd);
	}
}
