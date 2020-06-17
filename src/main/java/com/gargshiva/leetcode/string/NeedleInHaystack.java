package com.gargshiva.leetcode.string;

public class NeedleInHaystack {

    public static void main(String[] args) {
        String haystack = "flower";
        String needle = "er";

        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int needleLen = needle.length();
        char[] inpArr = haystack.toCharArray();
        int answer = -1;

        for (int i = 0; i <= inpArr.length - needleLen; ++i) {
            String sbtStr = haystack.substring(i, i + needleLen);

            if (sbtStr.equals(needle)) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
