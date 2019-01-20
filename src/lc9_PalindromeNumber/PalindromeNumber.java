package lc9_PalindromeNumber;

import Utils.Util;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome(565);
        Util.print("Number is palindrome : " + isPalindrome);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long revNum = 0;
        long inputNum = x;
        while (inputNum != 0) {
            revNum = revNum * 10 + inputNum % 10;
            inputNum = inputNum / 10;
        }
        return x == revNum;
    }

    private static boolean isPalindromeX(int x) {
        int inputNum = x;
        if (x < 0) {
            return false;
        }
        int newNum = 0;
        while (x != 0) {
            int rem = x % 10;
            int quotient = x / 10;
            newNum = newNum * 10 + rem;
            x = quotient;
        }
        return (newNum == inputNum);
    }
}
