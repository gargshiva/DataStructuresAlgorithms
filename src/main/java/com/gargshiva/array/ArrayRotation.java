package com.gargshiva.array;

/**
 * Array Reversal Algorithm
 * - Divide the array into 2 parts n-r and r
 * - Reverse each subpart
 * - Reverse the entire array
 */
public class ArrayRotation {

    public static void main(String[] args) {
        ArrayRotation arrayRotation = new ArrayRotation();
        int[] arr = new int[]{1, 2, 3, 4, 5,};
        arrayRotation.leftRotate(arr, 2);
        for (int a : arr) {
            System.out.print(a + " ");
        }

        arr = new int[]{1, 2, 3, 4, 5,};

        System.out.println();
        arrayRotation.leftRotate(arr, 4);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public void rightRotate(int[] arr, int positions) {
        positions = positions % arr.length;
        System.out.println("Poisitions => "+ positions);
        int len = arr.length;
        int leftSideStartIndex = 0;
        int leftSideEndIndex = len - positions - 1;
        int rightSideStartIndex = leftSideEndIndex + 1;
        int rightSideEndIndex = arr.length - 1;

        arrayReverse(arr, leftSideStartIndex, leftSideEndIndex);
        arrayReverse(arr, rightSideStartIndex, rightSideEndIndex);
        arrayReverse(arr, 0, arr.length - 1);
    }

    public void leftRotate(int[] arr, int positions) {
        int len = arr.length;
        int leftSideStartIndex = 0;
        int leftSideEndIndex = positions - 1;
        int rightSideStartIndex = leftSideEndIndex + 1;
        int rightSideEndIndex = arr.length - 1;

        arrayReverse(arr, leftSideStartIndex, leftSideEndIndex);
        arrayReverse(arr, rightSideStartIndex, rightSideEndIndex);
        arrayReverse(arr, 0, arr.length - 1);
    }

    public void arrayReverse(int[] arr, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            ++startIndex;
            --endIndex;
        }
    }
}
