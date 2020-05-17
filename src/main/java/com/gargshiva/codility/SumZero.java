package com.gargshiva.codility;

public class SumZero {
    public static void main(String[] args) {

        int[] op = solution(1);
        for (int i : op) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int N) {
        int startNum;
        int[] op = new int[N];
        if (N % 2 == 0) {
            startNum = 1;
            int i = -1;
            while (i < N - 1) {
                op[++i] = startNum;
                op[++i] = -startNum;
                ++startNum;
            }
        } else {
            startNum = (N / 2) * -1;
            int endNum = (N / 2);
            int i = 0;
            while (startNum <= endNum && i < N) {
                op[i] = startNum;
                ++i;
                ++startNum;
            }
        }
        return op;
    }
}
