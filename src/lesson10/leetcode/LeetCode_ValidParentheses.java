package lesson10.leetcode;

import java.util.Stack;

public class LeetCode_ValidParentheses {
    public static void main(String[] args) {
        System.out.println("Test 1 '()': " + isValid("()"));       // true
        System.out.println("Test 2 '()[]{}': " + isValid("()[]{}")); // true
        System.out.println("Test 3 '(]': " + isValid("(]"));       // false
        System.out.println("Test 4 '([)]': " + isValid("([)]"));   // false
        System.out.println("Test 5 '{[]}': " + isValid("{[]}"));   // true
    }

    public static boolean isValid(String s) {
        // 1. Use a Stack to keep track of expected closing brackets
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // 2. If Open Bracket -> Push the EXPECTED closing bracket
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            }
            // 3. If Close Bracket -> Check validity
            else {
                // If stack is empty (no opening bracket) OR top doesn't match
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        // 4. Valid only if stack is completely empty (all opened brackets were closed)
        return stack.isEmpty();
    }
}
