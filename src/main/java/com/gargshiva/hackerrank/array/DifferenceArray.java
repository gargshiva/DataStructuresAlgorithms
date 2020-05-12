package com.gargshiva.hackerrank.array;

public class DifferenceArray {
    public static void main(String[] args) {
        int[][] operations = {
                {1, 2, 100},
                {2, 5, 100},
                {3, 4, 100}
        };

        int n = 5;

        System.out.println(differenceArray(n, operations));

    }

    public static long solution(int n, int[][] operations) {
        long maxValue = Long.MIN_VALUE;

        long[] arr = new long[n];

        for (int[] row : operations) {
            int startIndex = row[0] - 1;
            int endIndex = row[1] - 1;
            long value = row[2];

            while (startIndex <= endIndex) {
                arr[startIndex] = arr[startIndex] + value;
                if (arr[startIndex] > maxValue) {
                    maxValue = arr[startIndex];
                }
                startIndex++;
            }
        }
        return maxValue;
    }

    public static long differenceArray(int n, int[][] queries) {
        long maxValue = Long.MIN_VALUE;
        long[] arr = new long[n + 2];
        for (int[] row : queries) {
            int startIndex = row[0];
            int endIndex = row[1];
            long value = row[2];

            arr[startIndex] = arr[startIndex] + value;
            arr[endIndex + 1] = arr[endIndex + 1] - value;
        }

        return prefixSumAlgo(arr);
    }

    public static long prefixSumAlgo(long[] arr) {
        long maxValue = Long.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
