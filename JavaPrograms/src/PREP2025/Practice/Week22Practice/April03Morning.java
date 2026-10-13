package PREP2025.Practice.Week22Practice;

import java.util.Stack;

/// Valid Parentheses
public class April03Morning {
    public static boolean isValid(String inputString) {
        Stack<Character> bracketStack = new Stack<>();
        for (char currentChar : inputString.toCharArray()) {
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                bracketStack.push(currentChar);
            } else {
                if (bracketStack.isEmpty()) {
                    return false;
                }
                char topElement = bracketStack.pop();
                if ((currentChar == ')' && topElement != '(') ||
                        (currentChar == ']' && topElement != '[') ||
                        (currentChar == '}' && topElement != '{')) {
                    return false;
                }
            }
        }
        return bracketStack.isEmpty();
    }
    static void main(String[] args) {
        String inputString = "()[]{}";
        System.out.println(isValid(inputString)); // true
    }
}
