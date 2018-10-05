package lc14_LongestCommonPrefix;

import Utils.Util;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"leet", "leezzode", "leetcode.com", "lemwhatever", "leetzzz"};
        String lcp = longestCommonPrefix(strs);
        Util.print("Longest Common Prefix is : " + lcp);
    }

    public static String longestCommonPrefix(String[] strs) {
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
