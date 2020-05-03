package com.gargshiva.array;

/**
 * Kadane Algo :
 *  - Find the Subarray with maximum sum
 *  - Find the indexes of the subarray with the maximum sum
 */
public class MaxSumSubarr {
    public static void main(String[] args) {
        int[] arr = {4, -3, -2, 2, 3, 1, -2 - 3, 4, 2, -6, -3, -1, 3, 1, 2};
        maxSumSubArr(arr);

    }

    public static void maxSumSubArr(int[] arr) {
        int max_so_far = arr[0];
        int max_end_here = 0;
        int start_idx = 0;
        int end_idx = 0;
        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            max_end_here = max_end_here + arr[i];
            if (max_so_far < max_end_here) {
                max_so_far = max_end_here;
                start_idx = s;
                end_idx = i;
            }
            if (max_end_here < 0) {
                max_end_here = 0;
                s = i + 1;
            }
        }


        System.out.println("Maximum Sum = " + max_so_far);
        System.out.println("Start Index : " + start_idx + " , End Index : " + end_idx);
    }
}
