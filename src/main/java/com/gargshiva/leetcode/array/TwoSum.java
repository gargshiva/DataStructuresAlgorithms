package com.gargshiva.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] op = twoSum(nums, target);

        for (int i : op) {
            System.out.print(i + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] op = new int[2];
        Map<Integer, Integer> numberIndexes = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            int diff = target - currentValue;
            if (numberIndexes.get(diff) != null) {
                op[0] = numberIndexes.get(diff);
                op[1] = i;
                break;
            } else {
                numberIndexes.put(currentValue, i);
            }
        }
        return op;
    }
}
