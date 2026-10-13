package PREP2025.Practice.Week21Practice;

import java.util.Stack;
/// Remove K Digits
public class March28Morning {
    public static String removeKdigits(String numberString, int k) {
        Stack<Character> digitStack = new Stack<>();
        for (char currentDigit : numberString.toCharArray()) {
            while (!digitStack.isEmpty() &&
                    k > 0 &&
                    digitStack.peek() > currentDigit) {
                digitStack.pop();
                k--;
            }
            digitStack.push(currentDigit);
        }
        // remove remaining digits if k > 0
        while (k > 0 && !digitStack.isEmpty()) {
            digitStack.pop();
            k--;
        }
        // build result
        StringBuilder resultBuilder = new StringBuilder();
        for (char digit : digitStack) {
            resultBuilder.append(digit);
        }
        // remove leading zeros
        while (resultBuilder.length() > 0 && resultBuilder.charAt(0) == '0') {
            resultBuilder.deleteCharAt(0);
        }
        if (resultBuilder.length() == 0) {
            return "0";
        }
        return resultBuilder.toString();
    }
    static void main(String[] args) {
        String numberString = "1432219";
        int k = 3;
        System.out.println(removeKdigits(numberString, k)); // 1219
    }
}