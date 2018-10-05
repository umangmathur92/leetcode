package lc_67_AddBinary;

//Given two binary strings, return their sum (also a binary string).
//The input strings are both non-empty and contains only characters 1 or 0.

import Utils.Util;

public class AddBinary {

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String outputStr = addBinary(a, b);
        Util.print(outputStr);
    }

    public static String addBinary(String a, String b) {
        char[] firstArr = a.toCharArray();
        char[] secondArr = b.toCharArray();
        StringBuilder outputStr = new StringBuilder();
        int i = firstArr.length - 1;
        int j = secondArr.length - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int digitA = (i < 0) ? 0 : ((firstArr[i] == '1') ? 1 : 0);
            int digitB = (j < 0) ? 0 : ((secondArr[j] == '1') ? 1 : 0);
            int newValOfCurrDigit = (digitA + digitB + carry) % 2;
            carry = (digitA + digitB + carry) / 2;
            outputStr.append(newValOfCurrDigit);
            i--;
            j--;
        }
        outputStr.append(carry != 0 ? carry : "");
        int x = 0;
        int y = outputStr.length() - 1;
        for (x=0; x<outputStr.length()/2; x++) {
            char val1 = outputStr.charAt(x);
            char val2 = outputStr.charAt(y);
            outputStr.setCharAt(x, val2);
            outputStr.setCharAt(y, val1);
            y--;
        }
        return outputStr.toString();
    }

}
