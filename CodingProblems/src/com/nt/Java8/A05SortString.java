package com.nt.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A05SortString {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(
                Arrays.asList("Swaraj", "Priyanka", "Amit")
        );

        // 1. Ascending order using Lambda Expression (A-Z)
        names.sort((a, b) -> a.compareTo(b));

        // 2. Ascending order using Comparator.naturalOrder()
        // names.sort(Comparator.naturalOrder());

        // 3. Ascending order using Method Reference
        // names.sort(String::compareTo);

        // 4. Descending order using Lambda Expression (Z-A)
        // names.sort((a, b) -> b.compareTo(a));

        // 5. Descending order using Comparator.reverseOrder()
        // names.sort(Comparator.reverseOrder());

        // 6. Descending order using reversed Comparator
        // names.sort(Comparator.naturalOrder().reversed());

        // 7. Case-insensitive ascending order
        // names.sort(String.CASE_INSENSITIVE_ORDER);

        // 8. Case-insensitive descending order
        // names.sort(String.CASE_INSENSITIVE_ORDER.reversed());

        // 9. Using Collections.sort() - ascending order
        // Collections.sort(names);

        // 10. Using Collections.sort() - descending order
        // Collections.sort(names, Comparator.reverseOrder());

        System.out.println(names);
    }
}