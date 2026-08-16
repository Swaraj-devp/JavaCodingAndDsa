package BasicProgramming;

public class A33DecimalToBinary {

    public static void main(String[] args) {

        int num = 15;
        int original = num;

        int binary = 0;
        int place = 1;

        while (num != 0) {

            int remainder = num % 2;

            binary = binary + remainder * place;

            num = num / 2;

            place = place * 10;
        }

        System.out.println(original + " in Binary = " + binary);
    }
}