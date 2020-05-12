package com.gargshiva.array;

/**
 * Find missing number in Array of first n natural numbers
 * <p>
 * a (+) a = 0
 * a (+) 0 = 0
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        findMissingNumber(arr);
    }

    public static void findMissingNumber(int[] arr) {
        int sumNaturalNumbers = findSum(arr[arr.length - 1]);
        int arrSum = 0;
        for (int j = 0; j < arr.length; j++) {
            arrSum = arrSum ^ arr[j];
        }

        System.out.println("Missing Number => " + (sumNaturalNumbers ^ arrSum));
    }

    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum ^ i;
        }
        return sum;
    }
}
