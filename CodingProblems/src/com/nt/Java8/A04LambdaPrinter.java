package com.nt.Java8;

@FunctionalInterface
interface Printer{
	
	void printer( String msg);
}
public class A04LambdaPrinter {

	public static void main(String[] args) {
		
		Printer p  = msg -> System.out.println(msg);
		p.printer("Hello Swaraj");
	}
}
