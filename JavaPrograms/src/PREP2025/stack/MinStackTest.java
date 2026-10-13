package PREP2025.stack;
import java.util.Stack;
// LC Min Stack https://leetcode.com/problems/min-stack/description/
/// 1️⃣ ELI5 explanation
/// Normal PREP2025.stack can do:
/// push
/// pop
/// top
/// But problem asks extra:
/// “Tell me the minimum element anytime… instantly.”
/// If you scan the whole PREP2025.stack each time → slow.
/// So trick is:
/// ✅ store minimum so far along with each push.
/// Like:
/// When you push value x, also remember:
/// “What was the minimum till now?”
/// 2️⃣ Core idea (pattern)
/// Maintain two stacks:
/// PREP2025.stack → stores actual values
/// minStack → stores minimum at every level
/// When pushing:
/// push value into PREP2025.stack
/// push min(x, currentMin) into minStack
/// When popping:
/// pop from both
/// Now:
/// minStack.peek() always gives min in O(1)
/// 3️⃣ Why this works (normal explanation)
/// At any moment, stacks have same size.
/// So for each value in PREP2025.stack,
/// there is a corresponding minimum value up to that point in minStack.
/// So removing top also removes its min snapshot.
// Interview-ready one-liner - “I maintain a second PREP2025.stack where each position stores the minimum value up to that point, so getMin() is always O(1).”
class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return minStack.peek();
    }
}
public class MinStackTest {
    static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(5);
        ms.push(2);
        ms.push(8);
        System.out.println(ms.getMin()); // 2
        System.out.println(ms.top());    // 8
        ms.pop();
        System.out.println(ms.top());    // 2
        System.out.println(ms.getMin()); // 2
    }
}