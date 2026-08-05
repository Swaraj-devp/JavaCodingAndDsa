package BasicProgramming;

public class A06SwapWithoutThird {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		a= b+a; //30
		b= a-b;  // 
		a= a-b;
		
		System.out.println("a= " +a );
		System.out.println("b= "+b);
	}
}
