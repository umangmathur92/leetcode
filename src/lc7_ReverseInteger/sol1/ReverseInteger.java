package lc7_ReverseInteger.sol1;

import Utils.Util;

public class ReverseInteger {

    public static void main(String[] args) {
        int n = 946324351;
        int numOfIntervals = reverse(n);
        Util.print("Reversed integer : " + numOfIntervals);
    }

    public static int reverse(int n) {
        boolean hasMinusSign = false;
        String str = String.valueOf(n);
        if (str.startsWith("-")) {
            str = str.replace("-","");
            hasMinusSign = true;
        }
        int strLen = str.length();
        String outPutStr = "";
        for (int i=strLen-1; i >= 0; i--) {
            outPutStr = outPutStr + str.substring(i, i+1);
        }
        outPutStr = hasMinusSign ? "-" + outPutStr : outPutStr;
        try {
            return Integer.parseInt(outPutStr);
        } catch (Exception e) {
            return 0;
        }
    }

}
