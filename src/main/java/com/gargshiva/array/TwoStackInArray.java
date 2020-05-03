package com.gargshiva.array;

public class TwoStackInArray {

    static int leftStackIndex;
    static int rightStackIndex;

    public static void main(String[] args) {
        int[] arr = new int[5];
        leftStackIndex = -1;
        rightStackIndex = arr.length;

       // popFromLeftStack(arr);
       // popFromRightStack(arr);
        pushInLeftStack(arr, 10);
        pushInLeftStack(arr, 20);
        pushInRightStack(arr,3);
        pushInRightStack(arr,4);
        pushInRightStack(arr,5);
       // pushInLeftStack(arr,6);

        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void pushInLeftStack(int[] arr, int element) {
        if (leftStackIndex + 1 == rightStackIndex) {
            throw new RuntimeException("LeftStack Overflow");
        }

        arr[leftStackIndex + 1] = element;
        leftStackIndex = leftStackIndex + 1;
    }

    public static void popFromLeftStack(int[] arr) {
        if (leftStackIndex < 0) {
            throw new RuntimeException("Stack Underflow");
        }

        leftStackIndex = leftStackIndex - 1;
    }

    public static void pushInRightStack(int[] arr, int element) {
        if (rightStackIndex - 1 == leftStackIndex) {
            throw new RuntimeException("RightStack Overflow");
        }

        arr[rightStackIndex - 1] = element;
        rightStackIndex = rightStackIndex - 1;
    }

    public static void popFromRightStack(int[] arr) {
        if (rightStackIndex > arr.length - 1) {
            throw new RuntimeException("Stack Underflow");
        }

        rightStackIndex = rightStackIndex + 1;
    }

}
