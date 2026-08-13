package BasicProgramming;

public class A22SpyNumber {

    public static void main(String[] args) {

        int num = 1124;

        int sum = 0;
        int product = 1;

        while (num != 0) {

            int digit = num % 10;

            sum += digit;
            product *= digit;

            num = num / 10;
        }

        if (sum == product) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not a Spy Number");
        }
    }
}