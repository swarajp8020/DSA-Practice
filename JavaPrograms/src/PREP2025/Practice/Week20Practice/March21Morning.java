package PREP2025.Practice.Week20Practice;

import java.util.Stack;

/// Largest Rectangle in Histogram
public class March21Morning {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> indexStack = new Stack<>();
        int maximumArea = 0;
        for (int currentIndex = 0; currentIndex <= heights.length; currentIndex++) {
            int currentHeight = (currentIndex == heights.length) ? 0 : heights[currentIndex];
            while (!indexStack.isEmpty() &&
                    currentHeight < heights[indexStack.peek()]) {
                int height = heights[indexStack.pop()];
                int rightBoundary = currentIndex;
                int leftBoundary = indexStack.isEmpty() ? -1 : indexStack.peek();
                int width = rightBoundary - leftBoundary - 1;
                int area = height * width;
                maximumArea = Math.max(maximumArea, area);
            }
            indexStack.push(currentIndex);
        }
        return maximumArea;
    }
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights)); // 10
    }
}
