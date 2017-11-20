package lc35_SearchInsertPosition;

import Utils.Util;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] sortedArr = {1,5,8,9};
        int target = 12;
        int index = searchInsert(sortedArr, target);
        Util.print("Index of target : " + index);
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

}
