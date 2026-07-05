package com.nt.String;

public class S04ReverseSentenceAndWords {

    public static void main(String[] args) {

        String str = "Java is Awesome";

        String[] words = str.split(" ");

        // Reverse the order of words
        int left = 0;
        int right = words.length - 1;

        while (left < right) {

            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        // Reverse each word
        for (String word : words) {

            char[] arr = word.toCharArray();

            int l = 0;
            int r = arr.length - 1;

            while (l < r) {

                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

                l++;
                r--;
            }

            System.out.print(new String(arr) + " ");
        }
    }
}