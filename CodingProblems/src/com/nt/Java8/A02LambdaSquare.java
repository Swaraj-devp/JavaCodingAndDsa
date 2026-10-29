package com.nt.Java8;
@FunctionalInterface
interface Square {
	int findsquare(int a);
}
public class A02LambdaSquare {

	public static void main(String[] args) {
		
		Square  squareNum = (int a)->{return a*a;};
		
		System.out.println(squareNum.findsquare(5));
	}
}
