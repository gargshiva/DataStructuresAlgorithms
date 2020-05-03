package com.gargshiva.array;

public class OddOccurrence {
    /**
     * Find the number which occur odd number of times in array (Assume there is only 1)
     * 1 ^ 1 = 0
     * 1 ^ 0 = 0
     * 0 ^ 0 = 0
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 3, 3, 4, 5, 5};
        oddOccurrence(arr);
    }

    public static void oddOccurrence(int[] arr) {
        int intialNum = arr[0];

        for (int i = 1; i < arr.length; ++i) {
            intialNum = intialNum ^ arr[i];
        }

        System.out.println("Output => " + intialNum);
    }
}
