package lc239_SlidingWindowMaximum;

import Utils.Util;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] inputArr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] resultArr = maxSlidingWindow(inputArr, k);
        Util.print(Arrays.toString(resultArr));
    }

    public static int[] maxSlidingWindow(int[] inputArr, int windowSize) {
        if (inputArr == null || windowSize <= 0) {
            return new int[0];
        }
        int inputArrLength = inputArr.length;
        int[] outputArr = new int[inputArrLength - windowSize + 1];
        int ri = 0;// store index
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < inputArr.length; i++) {
            // remove numbers out of range of window
            while (!deque.isEmpty() && deque.peekFirst() < i - windowSize + 1) {
                deque.pollFirst();
            }
            // remove smaller numbers in window range as they are useless
            while (!deque.isEmpty() && inputArr[deque.peekLast()] < inputArr[i]) {
                deque.pollLast();
            }
            // deque contains index... outputArr contains content
            deque.offerLast(i);
            if (i >= windowSize - 1) {
                outputArr[ri] = inputArr[deque.peekFirst()];
                ri = ri + 1;
            }
        }
        return outputArr;
    }

}
