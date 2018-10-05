package lc1_TwoSum;

import Utils.Util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] inputArr = {2,7,11,15};
        Util.print(Arrays.toString(twoSumX(inputArr, 9)));
    }

    private static int[] twoSumX(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement))
                if ((map.get(complement) != i)) {
                    return new int[]{i, map.get(complement)};
                }
        }
        return new int[]{};
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums.length; j++) {
                if (j!=i) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i , j};
                    }
                }
            }
        }
        return new int[]{};
    }

}
