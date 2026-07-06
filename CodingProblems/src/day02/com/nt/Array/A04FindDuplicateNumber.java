package day02.com.nt.Array;

import java.util.HashSet;

public class A04FindDuplicateNumber {

    public static void main(String[] args) {

        int arr[] = {1, 3, 4, 2, 2, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num)) {
                System.out.println("Duplicate Number : " + num);
                return;
            }

            set.add(num);
        }

        System.out.println("No Duplicate Found");
    }
}