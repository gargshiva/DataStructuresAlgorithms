package com.gargshiva.leetcode.string;


/**
 *  https://leetcode.com/problems/longest-common-prefix/
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 *
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "dlow"};
        System.out.println(characterApproach(strs));
    }

    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String str1 = strs[0];
        int j = 1;
        while (j < strs.length) {
            String str2 = strs[j];
            str1 = findPrefix(str1, str2);
            ++j;
        }
        return str1;
    }


    private static String findPrefix(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        int p1 = 0;
        int p2 = 0;

        StringBuilder sb = new StringBuilder("");
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] == arr2[p2]) {
                sb.append(arr1[p1]);
            } else break;
            ++p1;
            ++p2;
        }

        return sb.toString();
    }


    static String characterApproach(String[] strs) {
        int minLength = minLength(strs);

        StringBuilder sb = new StringBuilder("");

        // Max characters as a prefix possible .
        for (int i = 0; i < minLength; ++i) {
            char ch = strs[0].toCharArray()[i];
            int result = 0;

            for (int k = 1; k < strs.length; ++k) {
                if (ch != strs[k].toCharArray()[i]) {
                    result = 1;
                    break;
                }
            }

            if(result == 0){
                sb.append(ch);
            }else {
                break;
            }
        }

        return sb.toString();
    }

    private static int minLength(String[] arr) {
        if(arr.length == 0){
            return  0;
        }
        int max = Integer.MAX_VALUE;
        for (String s : arr) {
            if (max > s.length()) {
                max = s.length();
            }
        }

        return max;
    }
}

