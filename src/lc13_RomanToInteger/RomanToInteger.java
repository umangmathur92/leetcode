package lc13_RomanToInteger;

import Utils.Util;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        int num = romanToInt("XXIX");
        Util.print("Integer is : " + num);
    }

    private static int romanToInt(String s) {
        int outputNum = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] inputCharArr = s.toCharArray();
        int len = inputCharArr.length;
        int prevNum = 0;
        for (int i = len - 1; i >= 0; i--) {
            char currChar = inputCharArr[i];
            int currNum = map.get(currChar);
            if (currNum < prevNum) {
                outputNum = outputNum - currNum;
            } else {
                outputNum = outputNum + currNum;
            }
            prevNum = currNum;
        }
        return outputNum;
    }

    public static int romanToIntX(String s) {
        int outputNum = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int strLen = s.length();
        int prevInt = 0;
        for (int i = strLen - 1; i >= 0; i--) {
            String currRomanNumeral = String.valueOf(s.charAt(i));
            Integer currInt = map.get(currRomanNumeral);
            if (currInt >= prevInt) {
                outputNum = outputNum + currInt;
            } else {
                outputNum = outputNum - currInt;
            }
            prevInt = currInt;
        }
        return outputNum;
    }

    public static int romanToIntY(String s) {
        int outputNum = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int prevInt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int currInt = map.get(ch);
            if (currInt < prevInt) {
                outputNum = outputNum - currInt;
            } else {
                outputNum = outputNum + currInt;
            }
            prevInt = currInt;
        }
        return outputNum;
    }

}
