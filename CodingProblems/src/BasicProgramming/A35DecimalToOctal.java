package BasicProgramming;

public class A35DecimalToOctal {

    public static void main(String[] args) {

        int num = 83;
        int original = num;

        int octal = 0;
        int place = 1;

        while (num != 0) {

            int remainder = num % 8;

            octal = octal + remainder * place;

            num = num / 8;

            place = place * 10;
        }

        System.out.println(original + " in Octal = " + octal);
    }
}