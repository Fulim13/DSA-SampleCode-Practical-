package examples;

import java.util.Stack;

public class MathUtil {
    
    public static double evaluatePostfix(String expr) {
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (isOperator(ch)) {
                double rightOp = stack.pop();
                double leftOp = stack.pop();
                double result = performOperation(ch, leftOp, rightOp);
                stack.push(result);
            } else if (Character.isDigit(ch)) {
                stack.push(Double.parseDouble(ch+""));
            }
        }
        return stack.pop();
    }

    public static double performOperation(char operator, double leftOp, double rightOp) {
        double result = 0;
        switch (operator) {
            case '+':
                result = leftOp + rightOp;
                break;
            case '-':
                result = leftOp - rightOp;
                break;
                
            case '*':
                result = leftOp * rightOp;
                break;
                
            case '/':
                result = leftOp / rightOp;
                break;
                
        }
        return result;
    }

    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
    
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
        if (!stack.empty()) {
            isBalanced = false;
        }
        
        return isBalanced;
    }
}
