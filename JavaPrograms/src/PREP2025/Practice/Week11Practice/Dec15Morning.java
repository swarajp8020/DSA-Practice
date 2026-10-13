package PREP2025.Practice.Week11Practice;
import PREP2025.stack.nextGreaterElements;

import java.util.Arrays;
import java.util.Stack;

//class MinStack1 {
//    private Stack<Integer> PREP2025.stack;
//    private Stack<Integer> minStack;
//    public MinStack1(){
//        PREP2025.stack = new Stack<>();
//        minStack = new Stack<>();
//    }
//    public void push(int val) {
//        PREP2025.stack.push(val);
//        if (minStack.isEmpty()) {
//            minStack.push(val);
//        } else {
//            minStack.push(Math.min(val, minStack.peek()));
//        }
//    }
//    public void pop() {
//        PREP2025.stack.pop();
//        minStack.pop();
//    }
//    public int top() {
//        return PREP2025.stack.peek();
//    }
//    public int getMin() {
//        return minStack.peek();
//    }
//}
//class MyQueue1 {
//    private Stack<Integer> inStack;
//    private Stack<Integer> outStack;
//    public MyQueue1() {
//        inStack = new Stack<>();
//        outStack = new Stack<>();
//    }
//    public void push(int x){
//        inStack.push(x);
//    }
//    public int pop(){
//        shiftStack();
//        return outStack.pop();
//    }
//    public int peek(){
//        shiftStack();
//        return outStack.peek();
//    }
//    public boolean empty(){
//        return outStack.isEmpty() && inStack.isEmpty();
//    }
//    public void shiftStack(){
//        if (outStack.isEmpty()) {
//            while (!inStack.isEmpty()) {
//                outStack.push(inStack.pop());
//            }
//        }
//    }
//}


public class Dec15Morning {
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
        nextGreaterElements obj = new nextGreaterElements();
        int[] nums = {1, 2, 1};
        int[] result = obj.nextGreaterElements(nums);
        System.out.println(Arrays.toString(result)); // Expected: [2, -1, 2]
    }
//    public static int[] dailyTemperatures(int[] tempratures){
//        int n = tempratures.length;
//        int[] ans = new int[n];
//        Stack <Integer> PREP2025.stack = new Stack<>();
//        for (int i = 0; i < n; i++) {
//            while (!PREP2025.stack.isEmpty() && tempratures[i] > tempratures[PREP2025.stack.peek()]) {
//                int prevIndex = PREP2025.stack.pop();
//                ans[prevIndex] = i - prevIndex;
//            }
//            PREP2025.stack.push(i);
//        }
//        return ans;
//    }
//    static void main(String[] args) {
//        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
//        int[] result = dailyTemperatures(temperatures);
//        System.out.println(Arrays.toString(result));
//    }
//    public static boolean isValid(String s){
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
//        System.out.println(isValid("(}"));
//    }
//    static void main(String[] args) {
//        MyQueue1 q = new MyQueue1();
//        q.push(1);
//        q.push(2);
//        q.push(3);
//        System.out.println(q.peek());  // 1
//        System.out.println(q.pop());   // 1
//        System.out.println(q.pop());   // 2
//        System.out.println(q.empty()); // false
//        System.out.println(q.pop());   // 3
//        System.out.println(q.empty()); // true
//    }
//    static void main(String[] args) {
//        MinStack1 ms = new MinStack1();
//        ms.push(5);
//        ms.push(2);
//        ms.push(8);
//        System.out.println(ms.getMin());
//        System.out.println(ms.top());
//        ms.pop();
//        System.out.println(ms.top());
//        System.out.println(ms.getMin());
//    }
}
