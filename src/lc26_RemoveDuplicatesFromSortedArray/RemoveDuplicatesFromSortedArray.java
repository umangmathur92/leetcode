package lc26_RemoveDuplicatesFromSortedArray;

import Utils.Util;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] sortedIntArr = {1, 1, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        int lengthOfArrWithoutDuplicates = removeDuplicates(sortedIntArr);
        Util.print("Length of array without duplicates : " + lengthOfArrWithoutDuplicates);
        Util.print(Arrays.toString(sortedIntArr));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static int removeDuplicatesZ(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i = i + 1;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    private static int removeDuplicatesX(int[] nums) {
        int i = 0;
        int index = 0;
        while(i<nums.length) {
            int curr = nums[i];
            while(i<nums.length && curr==nums[i]) {
                i++;
            }
            nums[index] = curr;
            index++;
        }
        return index;
    }

    public int removeDuplicatesY(int[] nums) {
        int i = 0;
        int index = 0;
        while(i<nums.length) {
            if(nums[index]!=nums[i]) {
                index++;
                nums[index] = nums[i];
            }
            i++;
        }
        return index+1;
    }

}
