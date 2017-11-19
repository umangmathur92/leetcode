package lc27_RemoveElement;

import Utils.Util;

public class RemoveElement {

    public static void main(String[] args) {
        int[] integerArr = {3,2,2,3};
        int valToBeRemoved = 3;
        int lengthOfArrWithoutElement = removeElement(integerArr, valToBeRemoved);
        Util.print("Length of array without particular value : " + lengthOfArrWithoutElement);
    }

    public static int removeElement(int[] nums, int val) {
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
