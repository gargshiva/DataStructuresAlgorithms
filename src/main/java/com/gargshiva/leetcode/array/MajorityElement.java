package com.gargshiva.leetcode.array;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {
    public int majorityElement(int[] arr) {
        int candidate = arr[0];
        int count = 1;
        for(int i=1;i<arr.length;++i){
            if(arr[i] == candidate){
                ++count;
            }else{
                count --;
                if(count == 0){
                    candidate = arr[i];
                    count = 1;
                }

            }
        }
        return candidate;
    }
}
