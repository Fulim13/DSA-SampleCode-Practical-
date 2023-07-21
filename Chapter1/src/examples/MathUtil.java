package examples;

import java.util.Stack;

public class MathUtil {

    public static boolean isMatch(char leftBracket, char rightBracket) {
        switch (leftBracket) {
            case '(':
                return rightBracket == ')';
            case '[':
                return rightBracket == ']';
            case '{':
                return rightBracket == '}';
        }
        return false;
    }

    public static boolean checkbalance(String expression) {
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;
        int i = 0;
        while (isBalanced && i < expression.length()) {
            char nextCharacter = expression.charAt(i);
            switch (nextCharacter) {
                case '(':
                case '[':
                case '{':
                    stack.push(nextCharacter);
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty()) {
                        isBalanced = false;
                    } else {
                        char openDelimeter = stack.pop();
                        isBalanced = isMatch(openDelimeter, nextCharacter);
                    }
                    break;
            }
            i++;
        }
        if(!stack.empty()){
            isBalanced = false;
        }
        
        return isBalanced;
    }
}
