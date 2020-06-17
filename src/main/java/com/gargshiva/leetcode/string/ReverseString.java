package com.gargshiva.leetcode.string;


/**
 * https://leetcode.com/problems/reverse-string/
 *
 *
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 */
public class ReverseString {
    public static void main(String[] args) {
        reverseString("h".toCharArray());
    }
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            swap(s, i, j);
            ++i;
            --j;
        }
    }


    public static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

    }
}
