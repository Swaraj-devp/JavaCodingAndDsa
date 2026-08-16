package BasicProgramming;

public class A37DecimalToHexadecimal {

    public static void main(String[] args) {

        int num = 26;
        int original = num;

        String hexadecimal = "";

        while (num != 0) {

            int remainder = num % 16;

            if (remainder < 10) {
                hexadecimal = remainder + hexadecimal;
            } else {
                hexadecimal = (char) ('A' + (remainder - 10)) + hexadecimal;
            }

            num = num / 16;
        }

        System.out.println(original + " in Hexadecimal = " + hexadecimal);
    }
}