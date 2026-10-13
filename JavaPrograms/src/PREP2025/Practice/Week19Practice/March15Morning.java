package PREP2025.Practice.Week19Practice;

import java.util.Stack;

/// Largest Rectangle in Histogram – LC 84
public class March15Morning {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for(int i = 0; i <= heights.length; i++) {
            int h = (i == heights.length) ? 0 : heights[i];
            while(!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width;
                if(stack.isEmpty())
                    width = i;
                else
                    width = i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
    static void main(String[] args) {
        March15Morning sol = new March15Morning();
        int[] heights = {2,1,5,6,2,3};
        System.out.println("Largest Rectangle: "
                + sol.largestRectangleArea(heights));
    }
}
