package com.gargshiva.leetcode.string;

/**
 *
 */
public class UniqueCharacter {

    public static void main(String[] args) {
        UniqueCharacter uq = new UniqueCharacter();
        System.out.println(uq.firstUniqueChar("bhivas"));
    }


    public int firstUniqueChar(String s) {

        int[] arr = new int[26];
        char[] ch = s.toCharArray();
        int answer = -1;

        for (int i = 0; i < ch.length; ++i) {
            int pos = s.charAt(i) - 'a';
            arr[pos] = arr[pos] + 1;
        }

        for (int i = 0; i < ch.length; ++i) {
            int pos = s.charAt(i) - 'a';
            if (arr[pos] == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
