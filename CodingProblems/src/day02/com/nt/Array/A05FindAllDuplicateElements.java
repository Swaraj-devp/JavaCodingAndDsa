package day02.com.nt.Array;
import java.util.HashMap;

public class A05FindAllDuplicateElements {

    public static void main(String[] args) {

        int arr[] = {1,2,3,2,4,5,1,6,4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.print("Duplicate Elements: ");

        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
    }
}