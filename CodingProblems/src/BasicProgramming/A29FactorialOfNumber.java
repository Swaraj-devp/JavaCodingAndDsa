package BasicProgramming;

public class A29FactorialOfNumber {
	public static void main(String[] args) {

		int num =5;
		
		int factorial =1;
		System.out.print("Factorails : ");
		for(int i =1;i<=num ;i++) {
			
			factorial*=i;
			System.out.print(i+" ");
		}
		System.out.println("Factorial : "+factorial);
	}
}
