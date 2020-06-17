package com.gargshiva.leetcode.string;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        String op = "";
        for (int i = 0; i < n; ++i) {
            if (i == 0) op = "1";
            else op = findNext(op);
        }
        return op;
    }


    public static String findNext(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int i = 0;
        int j = i + 1;
        int count = 1;

        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                ++count;
            } else {
                sb.append(count).append(arr[i]);
                count = 1;
            }

            ++i;
            ++j;
        }

        return sb.append(count).append(arr[i]).toString();
    }
}
