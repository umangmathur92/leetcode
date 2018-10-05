package lc38_CountAndSay;

import Utils.Util;

public class CountAndSay {

    public static void main(String[] args) {
        String outPutStr = countAndSay(5);
        Util.print(outPutStr);
    }

    private static String countAndSay(int n) {
        StringBuilder str = new StringBuilder("1");
        for (int i=1; i<n; i++) {
            int count =1;
            char ch = str.charAt(0);
            StringBuilder innerLoopStr = new StringBuilder("");
            for (int j=1; j< str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count = count +1;
                } else {
                    innerLoopStr.append(count).append(ch);
                    ch = str.charAt(j);
                    count = 1;
                }
            }
            str = (innerLoopStr).append(count).append(ch);
        }
        return str.toString();
    }
}
