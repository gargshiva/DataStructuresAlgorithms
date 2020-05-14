package com.gargshiva.leetcode.array;

/**
 * https://leetcode.com/problems/missing-number/
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 * Example 2:
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sumN = (len* (len+1))/2;
        int sum = 0;
        for(int i : nums){
            sum = sum+i;
        }
        return sumN - sum;
    }

}
