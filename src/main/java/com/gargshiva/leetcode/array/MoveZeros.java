package com.gargshiva.leetcode.array;

/**
 *
 * https://leetcode.com/problems/move-zeroes/
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 *
 */
public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }

    }

    /**
     * Increment b
     * Keep moving till you find a == 0
     * Swap only when a=0 and b!=0
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int a = 0;
        int b = 0;
        while (b < nums.length) {
            for (int i : nums) {
                System.out.print(i + " ");
            }
            if (nums[a] != 0) {
                ++a;
            } else if (nums[a] == 0 && nums[b] != 0) {
                swap(nums, a, b);
                ++a;
            }
            ++b;
        }

    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
