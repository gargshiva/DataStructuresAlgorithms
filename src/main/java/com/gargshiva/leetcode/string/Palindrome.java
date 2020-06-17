package com.gargshiva.leetcode.string;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    /**
     * Consider only alphanumeric chars
     */
    public static boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().trim().toCharArray();
        int i = 0;
        int j = arr.length - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (!isAlphaNumeric(arr[i])) {
                ++i;
                continue;
            }
            if (!isAlphaNumeric(arr[j])) {
                --j;
                continue;
            }

            if (arr[i] != arr[j]) {
                isPalindrome = false;
                break;
            }
            ++i;
            --j;
        }

        return isPalindrome;
    }

    static boolean isAlphaNumeric(char ch) {
        int asciiCode = (int) ch;
        return ((asciiCode >= 48 && asciiCode <= 57)
                || (asciiCode >= 65 && asciiCode <= 90)
                || (asciiCode >= 97 && asciiCode <= 122));
    }
}
