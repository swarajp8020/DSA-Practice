package PREP2025.Practice.Week11Practice;

//class MinStack1 {
//    private Stack<Integer> PREP2025.stack;
//    private Stack<Integer> minStack;
//    public MinStack1() {
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
//    public void pop(){
//        PREP2025.stack.pop();
//        minStack.pop();
//    }
//    public int top(){return PREP2025.stack.peek();}
//    public int getMin() {return minStack.peek();}
//}
//class MyQueue1 {
//    private Stack<Integer> inStack;
//    private Stack<Integer> outStack;
//    public MyQueue1() {
//        inStack = new Stack<>();
//        outStack = new Stack<>();
//    }
//    public void push(int x) {
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
//        shiftStack();
//        return outStack.isEmpty() && inStack.isEmpty();
//    }
//    public void shiftStack() {
//        if (outStack.isEmpty()) {
//            while (!inStack.isEmpty()) {
//                outStack.push(inStack.pop());
//            }
//        }
//    }
//}

public class Dec16Morning {

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for (char c:magazine.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c:ransomNote.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) return false;
        }
        return true;
    }
    static void main(String[] args) {
        String ransom = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransom, magazine));
    }
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
//        System.out.println(ms.getMin()); // 2
//        System.out.println(ms.top());    // 8
//        ms.pop();
//        System.out.println(ms.top());    // 2
//        System.out.println(ms.getMin()); // 2
//    }
}
