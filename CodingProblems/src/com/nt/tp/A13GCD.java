package com.nt.tp;

public class A13GCD {

    public static void main(String[] args) {

        int a = 12;
        int b = 18;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        System.out.println("GCD: " + a);
    }
}