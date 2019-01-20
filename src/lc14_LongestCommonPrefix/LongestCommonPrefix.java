package lc14_LongestCommonPrefix;

import Utils.Util;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"leet", "leezzode", "leetcode.com", "lemwhatever", "leetzzz"};
        String lcp = longestCommonPrefix(strs);
        Util.print("Longest Common Prefix is : " + lcp);
    }

    private static String longestCommonPrefix(String[] strs) {
        int numStrs = strs.length;
        if(numStrs == 0) {
            return "";
        }
        String prefix = strs[0];
        for(int i=1; i < numStrs; i++) {
            String currStr = strs[i];
            while(!currStr.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static String longestCommonPrefixX(String[] strs) {
        String prefix = "";
        for (int i = 0; i < strs.length; i++) {
            String currStr = strs[i];
            if (i == 0) {
                prefix = currStr;
            }
            while (!currStr.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.equals("")) {
                return "";
            }
        }
        return prefix;
    }

}
