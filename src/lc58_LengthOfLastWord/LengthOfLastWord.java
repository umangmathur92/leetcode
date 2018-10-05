package lc58_LengthOfLastWord;

import Utils.Util;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String sentenceStr = "my name is umang";
        int lengthOfLastWord = lengthOfLastWord(sentenceStr);
        Util.print(lengthOfLastWord + "");
    }

    public static int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int charArrLength = chars.length;
        int count = 0;
        if (charArrLength >0) {
            int indexOfLastChar = charArrLength - 1;
            boolean isInputTrimmed = chars[indexOfLastChar] != ' ';
            int i = indexOfLastChar;
            while (i >= 0) {
                char currChar = chars[i];
                if (isInputTrimmed) {
                    if (currChar == ' ') {
                        return count;
                    }
                    count++;
                } else if (currChar != ' ') {
                    isInputTrimmed = true;
                    count++;
                }
                i--;
            }
        }
        return count;
    }

}