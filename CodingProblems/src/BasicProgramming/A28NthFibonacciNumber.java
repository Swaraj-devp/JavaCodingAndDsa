package BasicProgramming;

public class A28NthFibonacciNumber {

    public static void main(String[] args) {

        int n = 7;

        int a = 0;
        int b = 1;

        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {

            for (int i = 2; i <= n; i++) {

                int c = a + b;

                a = b;
                b = c;
            }

            System.out.println(b);
        }
    }
}