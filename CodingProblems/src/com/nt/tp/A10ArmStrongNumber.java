package com.nt.tp;

public class A10ArmStrongNumber {

    public static void main(String[] args) {

        int num = 1634;
        int original = num;
        int temp = num;
        int digitCount = 0;
        int armStrong = 0;

        // Step 1: Count the digits
        while (temp != 0) {
            digitCount++;
            temp = temp / 10;
        }

        // Handle zero separately
        if (num == 0) {
            digitCount = 1;
        }

        // Step 2: Calculate the Armstrong sum
        temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            armStrong += (int) Math.pow(digit, digitCount);
            temp = temp / 10;
        }

        // Step 3: Compare with the original number
        if (original == armStrong) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}