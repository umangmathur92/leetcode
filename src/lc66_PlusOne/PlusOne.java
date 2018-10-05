package lc66_PlusOne;

//Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
//The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
//You may assume the integer does not contain any leading zero, except the number 0 itself.
//
//Example 1:
//Input: [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//
//Example 2:
//Input: [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.

import Utils.Util;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] inputArr = {1,2,3};
        int[] outputArr = plusOne(inputArr);
        Util.print(Arrays.toString(outputArr));
    }

    public static int[] plusOne(int[] digits) {
        int inputArrLen = digits.length;
        int indexOfLastNum = inputArrLen - 1;
        int lastDigit = digits[indexOfLastNum];
        if (lastDigit != 9) {
            digits[indexOfLastNum]++;
            return digits;
        } else {

            int i = indexOfLastNum;
            int carry = 1;
            while (i >= 0) {
                int sum = digits[i] + carry;
                if (sum > 9) {
                    int newValOfCurrDigit = sum % 10;
                    carry = sum / 10;
                    digits[i] = newValOfCurrDigit;
                } else {
                    digits[i]++;
                    carry = 0;
                    break;
                }
                i--;
            }
            if (carry == 1) {
                int[] newOutputArr = new int[inputArrLen + 1];
                newOutputArr[0] = 1;
                return newOutputArr;
            }
            return digits;
        }
    }

}