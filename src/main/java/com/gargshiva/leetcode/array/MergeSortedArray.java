package com.gargshiva.leetcode.array;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        optimizesSolution(nums1, 3, nums2, 3);
        // arrayShift(10, 2, nums1, 3);
        for (int i : nums1) {
            System.out.print(i + " ");
        }

    }

    // Start from back , where space is there to accommodate;

    public static void optimizesSolution(int[] nums1, int m, int[] nums2, int n) {
        --m;
        --n;
        int idx = nums1.length - 1;

        while (idx >= 0) {
            if (m < 0) {
                nums1[idx] = nums2[n--];
            } else if (n < 0) {
                nums1[idx] = nums1[m--];
            } else {
                if (nums1[m] == nums2[n]) {
                    nums1[idx] = nums2[n--];
                } else if (nums1[m] > nums2[n]) {
                    nums1[idx] = nums1[m--];
                } else {
                    nums1[idx] = nums2[n--];
                }
            }
            idx--;
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int cnt = m;

        while (i < nums1.length && j < n) {
            if (nums1[i] == nums2[j]) {
                arrayShift(nums2[j], ++i, nums1, cnt);
                ++i;
                ++j;
                ++cnt;

            } else if (nums1[i] > nums2[j]) {
                arrayShift(nums2[j], i, nums1, cnt);
                ++j;
                ++cnt;
            } else {
                ++i;
            }
        }

        int elementsLeft = n - j;
        int beginIndex = nums1.length - elementsLeft;

        System.out.println("Elements Left => " + elementsLeft);
        System.out.println("beginIndex => " + beginIndex);

        while (beginIndex < nums1.length && j < n) {
            nums1[beginIndex] = nums2[j];
            ++j;
            ++beginIndex;
        }


    }

    static void arrayShift(int element, int position, int[] arr, int m) {
        while (m > position) {
            arr[m] = arr[m - 1];
            --m;
        }
        arr[position] = element;
    }
}
