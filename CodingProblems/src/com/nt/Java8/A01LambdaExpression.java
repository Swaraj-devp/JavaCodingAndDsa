package com.nt.Java8;

@FunctionalInterface
interface MaxFinder {
    int findMax(int a, int b);
}
public class A01LambdaExpression {

	
	public static void main(String[] args) {
	
		MaxFinder max = (a, b) -> { int m = a > b ? a : b; return m; };
	
	 System.out.println(max.findMax(10, 25));   // 25
     System.out.println(max.findMax(40, 7)); 
		
	}
}
