package lc20_ValidParantheses;

import Utils.Util;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String str = "]";
        boolean isValid = isValidz(str);
        Util.print("Parantheses Validity : " + isValid);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            switch (ch) {
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

    private static boolean isValidz(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put('(', ')');
        bracketsMap.put('{', '}');
        bracketsMap.put('[', ']');
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            switch (currentChar) {
                case '(':
                case '{':
                case '[':
                    stack.push(currentChar);
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.empty()) {
                        return false;
                    } else {
                        char peekVal = stack.peek();
                        if (currentChar == bracketsMap.get(peekVal)) {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                    break;
            }
        }
        return stack.empty();
    }

}
