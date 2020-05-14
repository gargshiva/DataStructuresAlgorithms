package com.gargshiva.leetcode.array;

import java.util.HashMap;

/**
 *
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Boolean> numsMap = new HashMap<Integer,Boolean>();
        boolean isDuplicate = false;
        for(int i : nums){
            if(numsMap.get(i) !=null){
                isDuplicate = true;
                break;
            }else{
                numsMap.put(i,true);
            }
        }
        return isDuplicate;
    }
}
