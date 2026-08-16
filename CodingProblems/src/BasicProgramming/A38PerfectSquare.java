package BasicProgramming;

public class A38PerfectSquare {

    public static void main(String[] args) {

        int num = 25;

        int root = (int) Math.sqrt(num);

        if (root * root == num) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }
    }
}