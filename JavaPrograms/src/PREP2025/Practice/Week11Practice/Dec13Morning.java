package PREP2025.Practice.Week11Practice;


import java.util.Arrays;
import java.util.Stack;

public class Dec13Morning {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 2 * n; i++) {
            int idx = i % n;
            while (!stack.isEmpty() && nums[idx] > nums[stack.peek()]) {
                int prevIndex = stack.pop();
                ans[prevIndex] = nums[idx];
            }
            if (i < n) stack.push(idx);
        }
        return ans;
    }

    static void main(String[] args) {
        Dec13Morning obj = new Dec13Morning();
        int[] nums = {1, 2, 1};
        int[] result = obj.nextGreaterElements(nums);
        System.out.println(Arrays.toString(result)); // Expected: [2, -1, 2]
    }
//    public static int[] dailyTemperatures(int[] tempratures) {
//        int n = tempratures.length;
//        int[] ans = new int[n];
//        Stack<Integer> PREP2025.stack = new Stack<>();
//        for (int i = 0; i < n; i++) {
//            while (!PREP2025.stack.isEmpty() && tempratures[i] > tempratures[PREP2025.stack.peek()] ) {
//                int prevIndex = PREP2025.stack.pop();
//                ans[prevIndex] = i - prevIndex;
//            }
//            PREP2025.stack.push(i);
//        }
//        return ans;
//    }
//
//    static void main(String[] args) {
//        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
//        int[] result = dailyTemperatures(temperatures);
//        System.out.println(Arrays.toString(result));
//    }
//    public static boolean isValid (String s) {
//        Stack<Character> PREP2025.stack = new Stack<>();
//        for (char ch:s.toCharArray()) {
//            if (ch == '(' || ch == '{' || ch == '[') {
//                PREP2025.stack.push(ch);
//            } else {
//                if (PREP2025.stack.isEmpty()) return false;
//                char top = PREP2025.stack.pop();
//                if (ch == ')' && top != '(') return false;
//                if (ch == '}' && top != '{') return false;
//                if (ch == ']' && top != '[') return false;
//            }
//        }
//        return PREP2025.stack.isEmpty();
//    }
//
//    static void main(String[] args) {
//        System.out.println(isValid("{[()]}"));
//        System.out.println(isValid("(]"));
//    }
}
