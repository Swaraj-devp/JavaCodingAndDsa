package BasicProgramming;

public class A36OctalToDecimal {

    public static void main(String[] args) {

        int octal = 123;

        int decimal = 0;
        int power = 0;

        while (octal != 0) {

            int digit = octal % 10;

            decimal = decimal + digit * (int) Math.pow(8, power);

            octal = octal / 10;

            power++;
        }

        System.out.println("Decimal = " + decimal);
    }
}