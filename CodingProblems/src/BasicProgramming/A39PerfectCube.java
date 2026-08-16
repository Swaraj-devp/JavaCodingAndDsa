package BasicProgramming;

public class A39PerfectCube {

    public static void main(String[] args) {

        int num = 27;

        int root = (int) Math.round(Math.cbrt(num));

        if (root * root * root == num) {
            System.out.println("Perfect Cube");
        } else {
            System.out.println("Not a Perfect Cube");
        }
    }
}