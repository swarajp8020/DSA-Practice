package PREP2025.Practice.Week19Practice;

import java.util.Arrays;
import java.util.Stack;

public class March11Morning {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() &&
                    temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return result;
    }
    static void main(String[] args) {
        March11Morning sol = new March11Morning();
        int[] temps = {73,74,75,71,69,72,76,73};
        int[] result = sol.dailyTemperatures(temps);
        System.out.println(Arrays.toString(result));
    }
}
