package lc88_MergeSortedArray;

import Utils.Util;

import java.util.Arrays;

//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//Note:
//The number of elements initialized in nums1 and nums2 are m and n respectively.
//You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
//Example:
//
//Input:
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//Output: [1,2,2,3,5,6]

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        Util.print(Arrays.toString(nums1));
    }

    public static void merge(int[] firstArr, int len1, int[] secondArr, int len2) {
        int i = len1 - 1;
        int j = len2 - 1;
        int k = len1 + len2 - 1;
        while (i >= 0 && j >= 0) {
            if (firstArr[i] >= secondArr[j]) {
                firstArr[k--] = firstArr[i--];
            } else {
                firstArr[k--] = secondArr[j--];
            }
        }
        while (i >= 0) {
            firstArr[k--] = firstArr[i--];
        }
        while (j >= 0) {
            firstArr[k--] = secondArr[j--];
        }
    }

    public static void mergeX(int[] nums1, int m, int[] nums2, int n) {
        int x = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[x--] = nums1[i--];
            } else {
                nums1[x--] = nums2[j--];
            }
        }
        while (i >= 0) {
            nums1[x--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[x--] = nums2[j--];
        }
    }

}