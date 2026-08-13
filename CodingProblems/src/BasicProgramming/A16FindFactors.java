package BasicProgramming;

public class A16FindFactors {

	public static void main(String[] args) {

		int num = 28;

		for (int i = 1; i <= num; i++) {
			
			if(num%i==0) {
				
				System.out.println(i);
			}
		}
		System.out.println("This are the Factors.");
	}
}
