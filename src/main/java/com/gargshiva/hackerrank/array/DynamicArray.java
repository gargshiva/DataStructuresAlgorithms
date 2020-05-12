package com.gargshiva.hackerrank.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
        List<ArrayList<Integer>> queries = new ArrayList<ArrayList<Integer>>(5);

        int seqSize = queries.get(0).size();

    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> op = new ArrayList<Integer>();
        ArrayList<Integer>[] seqList = new ArrayList[n];
        for (int i = 0; i < n; ++i) {
            ArrayList<Integer> t = new ArrayList<Integer>(n);
            seqList[i] = t;
        }
        int lastAnswer = 0;
        for (List<Integer> query : queries) {
            int queryType = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int index = (x ^ lastAnswer) % n;
            if (queryType == 1) {
                seqList[index].add(y);
            } else if (queryType == 2) {
                int seqSize = seqList[index].size();
                lastAnswer = seqList[index].get(y % seqSize);
                op.add(lastAnswer);
            }
        }
        return op;
    }

    public static List<Integer> dynamicArray1(int n, List<List<Integer>> queries) {
        List<Integer> op = new ArrayList<Integer>();
        Integer[][] seqList = new Integer[n][n];
        int[] arrIndex = new int[n];
        Arrays.fill(arrIndex, -1);
        int lastAnswer = 0;
        for (List<Integer> query : queries) {
            int queryType = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int index = (x ^ lastAnswer) % n;
            if (queryType == 1) {
                seqList[index][arrIndex[index] + 1] = y;
                arrIndex[index] = arrIndex[index] + 1;
            } else if (queryType == 2) {
                int seqSize = arrIndex[index];
                lastAnswer = seqList[index][y % seqSize];
                op.add(lastAnswer);
            }
        }
        return op;
    }


}

