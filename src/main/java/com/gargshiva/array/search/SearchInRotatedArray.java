package com.gargshiva.array.search;

/**
 * Search an element in rotated and sorted array
 */
public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 100, 1010, 3, 4, 5, 6, 7};

        int index = SearchInRotatedArray.pivotElement(arr, 0, arr.length - 1);
        System.out.println("Index = " + index + ", Element = " + arr[index]);
    }


    public static int pivotElement(int[] arr, int startIndex, int endIndex) {
        int median = (startIndex + endIndex) / 2;
        int medianElement = arr[median];

        if (median < endIndex && medianElement > arr[median + 1]) {
            return median + 1;
        } else if (median > startIndex && medianElement < arr[median - 1]) {
            return median;
        } else if (arr[startIndex] < medianElement) {
            return pivotElement(arr, median + 1, endIndex);
        } else {
            return pivotElement(arr, startIndex, median - 1);
        }
    }


    public static int binarySearch(int[] arr, int startIndex, int endIndex, int element) {
        int median = (startIndex + endIndex) / 2;
        int medianElement = arr[median];

        if (element == medianElement) {
            return median;
        } else if (element > medianElement) {
            return binarySearch(arr, median + 1, endIndex, element);
        } else {
            return binarySearch(arr, startIndex, median - 1, element);
        }
    }
}
