package com.gargshiva.hackerrank.array;

import java.util.ArrayList;
import java.util.List;

public class HourGlass {
    public static void main(String[] args) {

        int[][] arr =
                {
                        {1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 0, 2, 4, 4, 0},
                        {0, 0, 0, 2, 0, 0},
                        {0, 0, 1, 2, 4, 0}
                };

        int op = hourglassSum(arr);
        System.out.println("Sum => " + op);
    }

    static int hourglassSum(int[][] arr) {
        int maxTillNow = Integer.MIN_VALUE;
        int rows = arr.length - 2;
        int cols = arr[0].length - 2;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int firstRow = arr[r][c] + arr[r][c + 1] + arr[r][c + 2];
                int secondRow = arr[r + 1][c + 1];
                int thirdRow = arr[r + 2][c] + arr[r + 2][c + 1] + arr[r + 2][c + 2];
                int sum = firstRow + secondRow + thirdRow;
                if (maxTillNow < sum) {
                    maxTillNow = sum;
                }
            }
        }

        return maxTillNow;
    }
}