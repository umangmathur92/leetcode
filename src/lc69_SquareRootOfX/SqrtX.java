package lc69_SquareRootOfX;

import Utils.Util;

public class SqrtX {

    public static void main(String[] args) {
        int inputNum = 99;
        int sqrt = mySqrtX(inputNum);
        Util.print(sqrt + "");
    }

    //Brute Force
    public static int mySqrt(int x) {
        long sqrtVal = 0;
        for (long i = 1; i <= x; i++) {
            long num = i * i;
            if (num <= x) {
                sqrtVal = i;
            } else {
                break;
            }
        }
        return (int) sqrtVal;
    }

    //Binary Search
    public static int mySqrtX(int x) {
        if (x==0) {
            return 0;
        }
        long start = 1;
        long end = x;
        while (start < end) {
            long mid = (start + end) / 2;
            if (mid * mid > x) {
                end = mid;
            } else if ((mid * mid <=x) && ((mid+1) *(mid+1)>x)) {
                return (int) mid;
            } else {
                start = mid + 1;
            }
        }
        return (int) start;
    }

}
