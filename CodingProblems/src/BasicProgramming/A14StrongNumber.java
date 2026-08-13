package BasicProgramming;

public class A14StrongNumber {

	public static void main(String[] args) {
		
		int num = 145;
		
		int sum =0;
		int original = num;
		int factorial=1;
		while(num!=0) {
			
			int digit = num%10;
			
			for(int i=1;i<=digit;i++) {
				factorial*=i;
			}
			sum +=factorial;
			num = num/10;
			factorial =1;
		}
		if(original==sum) {
		System.out.println("Number is strong number");
		}else {
			System.out.println("Number is not strong");
		}
		
	}
}
