package com.gargshiva.array;

import java.util.Arrays;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 4, 2, 6, 10, 7, 1,9};
        Arrays.sort(arr);
        int gs = 11;
        printArray(arr);
        System.out.println();
        pairWithGivenSum(arr, gs);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    public static void pairWithGivenSum(int[] arr, int sum) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] > sum) {
                --j;
            } else if (arr[i] + arr[j] < sum) {
                ++i;
            } else {
                System.out.println("Pair found " + i + "," + j);
                ++i;
            }
        }
    }
}
