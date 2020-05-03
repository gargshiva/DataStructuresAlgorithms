package com.gargshiva.array;

/**
 * Moore's Voting algorithm to find the majority element
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 4};
        majorityElement(arr);
    }

    public static void majorityElement(int[] arr) {
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] != candidate) {
                --count;
                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                }
            }
        }

        System.out.println("Candidate for majority element =  " + candidate);

        int candidateCount = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == candidate) {
                ++candidateCount;
            }
        }

        if (candidateCount > arr.length / 2)
            System.out.println("Major element = " + candidate);
        else System.out.println("No Major element");
    }
}
