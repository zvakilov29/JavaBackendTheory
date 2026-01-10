package lesson14.leetcode;

import java.util.Stack;

public class LeetCode_EvaluateReversePolishNotation {
    public static void main(String[] args) {

    }

    private static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop(); // second operand
                int a = stack.pop(); // first operand

                int result;
                switch (token) {
                    case "+" -> result = a + b;
                    case "-" -> result = a - b;
                    case "*" -> result = a * b;
                    case "/" -> result = a / b;
                    default -> throw new IllegalArgumentException("Unknown operator: " + token);
                }

                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }

        }
        return stack.pop();

    }

    private static boolean isOperator(String s) {
        return s.length() == 1 && "+-*/".indexOf(s.charAt(0)) >= 0;
    }
}
