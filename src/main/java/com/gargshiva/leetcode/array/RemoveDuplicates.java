package com.gargshiva.leetcode.array;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                ++i;
                nums[i] = nums[j];
                ++j;
            } else ++j;
        }

        return i + 1;
    }
}
