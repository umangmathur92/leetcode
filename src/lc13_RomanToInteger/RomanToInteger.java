package lc13_RomanToInteger;

import Utils.Util;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        int num = romanToIntz("XXIX");
        Util.print("Integer is : " + num);
    }

    public static int romanToInt(String s) {
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

    public static int romanToIntz(String s) {
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
