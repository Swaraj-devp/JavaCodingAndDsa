package com.nt.Java8;

@FunctionalInterface
interface Greeter {

	String greater(String name);
}

public class A03LambdaGreeter {

	public static void main(String[] args) {

		Greeter greaterName = (String a) -> {
			return "Hello " + a;
		};

		System.out.println(greaterName.greater("Swaraj"));
	}
}
