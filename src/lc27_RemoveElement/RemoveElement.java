package lc27_RemoveElement;

import Utils.Util;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] integerArr = {3,2,2,3};
        int valToBeRemoved = 3;
        int lengthOfArrWithoutElement = removeElement(integerArr, valToBeRemoved);
        Util.print("Length of array without particular value : " + lengthOfArrWithoutElement);
        Util.print(Arrays.toString(integerArr));
    }
    private static int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            if(currNum!=val) {
                nums[index] = currNum;
                index++;
            }
        }
        return index;
    }

    private static int removeElementX(int[] nums, int val) {
        int i=0;
        for (int j=0; j<nums.length; j++) {
            if(nums[j]!=val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

}
