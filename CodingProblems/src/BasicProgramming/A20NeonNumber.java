package BasicProgramming;

public class A20NeonNumber {

    public static void main(String[] args) {

        int num = 9;

        int square = num * num;
        int sum = 0;

        while (square != 0) {

            int digit = square % 10;

            sum += digit;

            square = square / 10;
        }

        if (sum == num) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
    }
}