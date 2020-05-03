package com.gargshiva.array;

/**
 * Remove the duplicates from the sorted array
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 4, 5, 7};
        int distinctElementsIndex = RemoveDuplicates.removeDup(arr);

        for (int i = 0; i <= distinctElementsIndex; ++i) {
            System.out.print(arr[i] + " ");
        }
    }


    /**
     * Input array is sorted
     *
     * @param arr
     */
    public static int removeDup(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                ++j;
            }
        }

        arr[j] = arr[arr.length - 1];

        return j;
    }
}



