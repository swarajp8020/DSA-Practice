package PREP2025.stack;

// LC 232 — Implement Queue using Stacks  https://leetcode.com/problems/implement-queue-using-stacks/description/

import java.util.Stack;

/// 1️⃣ ELI5 first
/// Queue means:
/// First person enters → first person leaves.
/// Like movie ticket line.
/// Stack means:
/// Last thing put in → comes out first.
/// So PREP2025.stack is opposite of queue.
/// So how to make a queue using stacks?
/// Use two stacks:
/// inStack → where we push new elements (like entry gate)
/// outStack → where we pop elements (like exit gate)
/// When outStack is empty:
/// pour everything from inStack into outStack
/// this reverses order → making it FIFO
/// 2️⃣ Pattern (normal explanation)
/// Operations:
/// ✅ push(x)
/// Just push into inStack
/// ✅ pop()
/// If outStack empty → transfer
/// Then pop from outStack
/// ✅ peek()
/// Same as pop but don’t remove
/// ✅ empty()
/// Both stacks empty
/// 3️⃣ Why transfer works (core intuition)
/// If you push:
/// 1, 2, 3 into inStack
/// top becomes 3
/// Transfer to outStack:
/// pop 3 → push to out
/// pop 2 → push to out
/// pop 1 → push to out
/// Now outStack top is 1
/// So first element comes out first ✅
/// 4️⃣ Complexity (interview answer)
/// push() → O(1)
/// pop() / peek() → amortized O(1)
/// Because each element is moved from inStack to outStack only once.
/// 5️⃣ Common mistakes
/// ❌ transferring on every pop (unnecessary slow)
/// ✅ transfer only when outStack is empty
//Interview one-liner (keep ready)
//“I use two stacks: inStack for push, outStack for pop/peek. When outStack is empty, I shift all elements from inStack to outStack to reverse order and simulate FIFO.”
class MyQueue {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;
    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    public void push(int x) {
        inStack.push(x);
    }
    public int pop() {
        shiftStacks();
        return outStack.pop();
    }
    public int peek() {
        shiftStacks();
        return outStack.peek();
    }
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
    private void shiftStacks() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
}
public class ImplQueueStack {
    static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.peek());  // 1
        System.out.println(q.pop());   // 1
        System.out.println(q.pop());   // 2
        System.out.println(q.empty()); // false
        System.out.println(q.pop());   // 3
        System.out.println(q.empty()); // true
    }
}
