package com.gargshiva.array;

public class ZigZagArray {

    public static void main(String[] args) {
        System.out.println(5 ^ 8);
        int[] arr = {3, 4, 6, 2, 1, 8, 9};
        zigZagArray(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Flag == 0 then arr[i] < arr[i+1]
     * Flag ==1 then arr[i] > arr[i+1]
     * Swap;
     * @param arr
     */
    public static void zigZagArray(int[] arr) {
        int flag = 0;

        for (int i = 0; i < arr.length - 1; ++i)
            if (flag == 0) {
                flag = 1;
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            } else if (flag == 1) {
                flag = 0;
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
