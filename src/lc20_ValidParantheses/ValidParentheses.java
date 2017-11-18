package lc20_ValidParantheses;

import Utils.Util;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String str = "[()]}";
        boolean isValid = isValid(str);
        Util.print("Parantheses Validity : " + isValid);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (int i=0; i<charArray.length; i++) {
            char ch = charArray[i];
            switch(ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.empty() || stack.peek() != '(') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case '}':
                    if (stack.empty() || stack.peek() != '{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case ']':
                    if (stack.empty() || stack.peek() != '[') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
            }
        }
        return stack.empty();
    }

}
