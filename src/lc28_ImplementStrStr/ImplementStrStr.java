package lc28_ImplementStrStr;

import Utils.Util;

public class ImplementStrStr {

    public static void main(String[] args) {
        String haystack = "a", needle = "a";
        int indexOfNeedle = strStr(haystack, needle);
        Util.print("Index of needle : " + indexOfNeedle);
    }

    public static int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        if (needleLength==0) {
            return 0;
        }
        for (int i=0; i<haystackLength; i++) {
            int endIndex = i + needleLength;
            if (endIndex>haystackLength) {
                return -1;
            }
            String substring = haystack.substring(i, endIndex);
            if (needle.equals(substring)) {
                return i;
            }
        }
        return -1;
    }

    private static int strStrz(String haystack, String needle) {
        if (needle.length()==0) {
            return 0;
        }
        for (int i=0; i<haystack.length(); i++) {
            int endIndex = i + needle.length();
            if (endIndex > haystack.length()) {
                return -1;
            }
            if (haystack.substring(i, endIndex).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
