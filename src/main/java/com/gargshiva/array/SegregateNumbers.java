package com.gargshiva.array;

/**
 * Dutch National Flag Algo :
 * Segregate 0
 */
public class SegregateNumbers {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0,  1};

        segregateNumbers(arr1);

        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

    public static void segregateNumbers(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        System.out.println("high => " + high);
        while (mid <= high) {
            int element = arr[mid];
            switch (element) {
                case 0:
                    swap(arr, low, mid);
                    ++low;
                    ++mid;
                    break;
                case 1:
                    ++mid;
                    break;
                case 2:
                    swap(arr, mid, high);
                    --high;
                    break;
            }
        }
    }

    public static void swap(int[] arr, int indx1, int indx2) {
        int tmp = arr[indx1];
        arr[indx1] = arr[indx2];
        arr[indx2] = tmp;
    }
}
