package com.gargshiva.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 *
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 */
public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = generate(5);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

    private static List<List<Integer>> generate(int numRows) {
        int i = 0;
        List<List<Integer>> op = new ArrayList<List<Integer>>();

        while (i < numRows) {
            List<Integer> row = new ArrayList<Integer>();
            if (i == 0) {
                row.add(1);
            } else {
                List<Integer> previousRow = op.get(i - 1);
                int i1 = 0;
                int i2 = 1;
                row.add(previousRow.get(i1));
                while (i2 < previousRow.size()) {
                    row.add(previousRow.get(i1) + previousRow.get(i2));
                    i1++;
                    i2++;
                }
                row.add(previousRow.get(i1));
            }

            op.add(row);
            ++i;
        }

        return op;
    }
}
