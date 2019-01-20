package lc7_ReverseInteger;

import Utils.Util;

public class ReverseInteger {

    public static void main(String[] args) {
        int rev = reverse(1234);
        Util.print("" + rev);
    }

    private static int reverse(int x) {
        int newNum = 0;
        while (x != 0) {
            int rem = x % 10;
            int quotient = x / 10;
            newNum = newNum * 10 + rem;
            x = quotient;
        }
        return newNum;
    }

    private static int reverseX(int x) {
        long newNum = 0;
        while(x!=0) {
            int rem = x%10;
            int quotient = x/10;
            newNum = newNum*10 + rem;
            x = quotient;
        }
        if(newNum>Integer.MAX_VALUE || newNum<Integer.MIN_VALUE) {
            return 0;
        }
        return (int) newNum;
    }

    private static int reverseY(int x) {
        int newNum = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            if (newNum > Integer.MAX_VALUE / 10 || newNum == Integer.MAX_VALUE / 10 && digit > 7) {
                return 0;
            }
            if (newNum < Integer.MIN_VALUE / 10 || newNum == Integer.MIN_VALUE / 10 && digit < -8) {
                return 0;
            }
            newNum = newNum * 10 + digit;
        }
        return newNum;
    }

}
