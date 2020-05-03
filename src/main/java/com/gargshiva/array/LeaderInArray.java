package com.gargshiva.array;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {15, 16, 3, 2, 6, 1, 4};
        findLeader(arr);
    }

    public static void findLeader(int[] arr) {
        int endIndex = arr.length - 2;
        int maxFromRight = arr[arr.length - 1];
        System.out.println("Leader : " + maxFromRight);
        while (endIndex >= 0) {
            if (arr[endIndex] > maxFromRight) {
                maxFromRight = arr[endIndex];
                System.out.println("Leader : " + arr[endIndex]);
            }
            --endIndex;
        }
    }
}
