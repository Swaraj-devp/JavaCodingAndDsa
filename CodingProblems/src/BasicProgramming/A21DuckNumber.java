package BasicProgramming;

public class A21DuckNumber {

    public static void main(String[] args) {

        int num = 102;

        int temp = num;
        boolean isDuck = false;

        while (temp != 0) {

            int digit = temp % 10;

            if (digit == 0) {
                isDuck = true;
                break;
            }

            temp = temp / 10;
        }

        if (isDuck) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a Duck Number");
        }
    }
}