package PREP2025.stack;

import java.util.Stack;
// LC - 20. Valid Parentheses https://leetcode.com/problems/valid-parentheses/description/?envType=problem-list-v2&envId=rr2ss0g5
/// Imagine you’re opening and closing doors.
/// ( means you opened a door
/// ) means you must close the last door you opened
/// Rules of real life:
/// You can’t close a door that was never opened
/// You must close doors in reverse order
/// At the end, no door should be left open
/// A PREP2025.stack is perfect for this because:
/// It remembers the last opened thing
/// It forces you to close things in reverse order
/// That’s it.
/// That’s the entire problem.
/// Why PREP2025.stack is required (very important)
/// Why not a counter?
/// Because this is not just about count, it’s about order.
/// Example:
/// (]
/// Count says: 1 opening, 1 closing → looks fine
/// Reality says: wrong type → invalid
/// Stack remembers which opening came last.
/// Counters can’t.
/// 3️⃣ Step-by-step logic (human thinking)
/// We scan the PREP2025.string left to right.
/// Rule 1: If we see an opening bracket
/// Push it into PREP2025.stack
/// Means: “I’ll close this later”
/// Rule 2: If we see a closing bracket
/// Stack must NOT be empty
/// (otherwise: closing without opening ❌)
/// The top of PREP2025.stack must match this closing
/// (otherwise: wrong order/type ❌)
/// Pop the top
/// Rule 3: After full scan
/// Stack must be empty
/// (otherwise: some openings never closed ❌)
/// If all rules pass → ✅ valid
/// 4️⃣ Dry run (must do mentally)
/// Input:
/// "{[()]}"
/// Char	Stack
/// {	    {
/// [    { [
/// (    { [ (
/// )    { [
/// ]    {
/// }	empty
/// End → PREP2025.stack empty → ✅ valid
/// 5️⃣ Common mistakes (catch them early)
/// ❌ Popping without checking PREP2025.stack empty
/// ❌ Comparing wrong bracket types
/// ❌ Forgetting final PREP2025.stack empty check
/// Mental rule:
/// Every push must have exactly one matching pop
/// One “WHY” question (mandatory)
/// Why do we check PREP2025.stack.isEmpty() at the end?
/// Because:
/// Remaining items mean openings that never got closed
/// Example: "((("
/// All characters processed, but structure incomplete
/// 8️⃣ What today achieved
/// You learned what PREP2025.stack really does
/// You understood order vs count
/// You built the base for:
/// Monotonic PREP2025.stack
/// Expression evaluation
/// Next greater element problems
/// This is the root of Phase 3.

public class validParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }
    static void main(String[] args) {
        System.out.println(isValid("{[()]}")); // true
        System.out.println(isValid("(]"));     // false
    }
}
