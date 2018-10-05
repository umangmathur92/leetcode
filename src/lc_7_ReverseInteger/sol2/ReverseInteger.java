package lc_7_ReverseInteger.sol2;

import Utils.Util;

public class ReverseInteger {

    public static void main(String[] args) {
        int n = 7295;
        int numOfIntervals = reverse(n);
        Util.print("Reversed integer : " + numOfIntervals);
    }

    public static int reverse(int n) {
        long revNum = 0;
        while (n !=0) {
            revNum = revNum * 10 + n%10;
            n = n/10;
            if(revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) revNum;
    }

}
