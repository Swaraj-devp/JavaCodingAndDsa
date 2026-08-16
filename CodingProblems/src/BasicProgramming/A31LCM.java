package BasicProgramming;

public class A31LCM {
	public static void main(String[] args) {

		int a=12;
		
		int b=18;
		
		int max = Math.max(a, b);

		int lcm = max;
		
		while(true) {
			 if (lcm % a == 0 && lcm % b == 0) {
			        break;
			    }

			    lcm++;
		}
		System.out.println(lcm);
	}
}
