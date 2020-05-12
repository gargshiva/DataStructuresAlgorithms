package com.gargshiva.leetcode.array;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, -1, -3, 0, 5, -2, 3};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int runningSum = 0;
        for (int i : nums) {
            if (runningSum < 0) {
                runningSum = i;
            } else runningSum += i;

            if (runningSum > max) {
                max = runningSum;
            }
        }

        return max;
    }
}
