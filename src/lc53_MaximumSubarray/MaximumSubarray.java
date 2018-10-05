package lc53_MaximumSubarray;

import Utils.Util;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] inputArr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSubArray = maxSubArray(inputArr);
        Util.print(maxSubArray + "");
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int contSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int currNum = nums[i];
            contSum = contSum + currNum;
            if (currNum > contSum) {
                contSum = currNum;
            }
            if (contSum > maxSum) {
                maxSum = contSum;
            }
        }
        return maxSum;
    }

}