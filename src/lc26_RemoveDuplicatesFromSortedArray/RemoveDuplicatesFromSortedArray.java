package lc26_RemoveDuplicatesFromSortedArray;

import Utils.Util;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] sortedIntArr = {1, 1, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        int lengthOfArrWithoutDuplicates = removeDuplicates(sortedIntArr);
        Util.print("Length of array without duplicates : " + lengthOfArrWithoutDuplicates);
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

    public static int removeDuplicatesz(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i = i + 1;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
