package PREP2025.linkedList;
//LC 141 - Linked List Cycle  https://leetcode.com/problems/linked-list-cycle/description/?envType=problem-list-v2&envId=rr2ss0g5
/// Imagine this real-life story 🧠
/// You’re walking on stepping stones in a straight line.
/// Some paths end normally (no cycle)
/// Some paths secretly loop back (cycle)
/// You want to know:
/// “If I keep walking, will I ever come back to the same stone?”
/// The trick (same as LC 876)
/// We again use two walkers:
/// 🐢 slow → moves 1 step
/// 🐇 fast → moves 2 steps
/// Why this works (very important intuition)
/// Case 1: No cycle
/// Fast will reach the end (null) and stop.
/// 👉 No loop exists.
/// Case 2: Cycle exists
/// Fast keeps running inside the loop.
/// Because fast is faster:
/// It will eventually lap slow
/// They will meet at some node
/// 👉 If slow == fast → cycle exists.
/// Step-by-step example (cycle case)
/// List:
/// 1 → 2 → 3 → 4
///       ↑       ↓
///       ← ← ← ←
/// Start
/// slow = 1
/// fast = 1
/// Step 1
/// slow = 2
/// fast = 3
/// Step 2
/// slow = 3
/// fast = 2
/// Step 3
/// slow = 4
/// fast = 4   ← they meet!
/// 💥 Meeting means cycle detected.
/// Time & Space (say this calmly)
/// Time: O(n), Space: O(1)
/// No extra memory. No HashSet needed.
/// One sentence for interviews (MEMORIZE)
/// “I use Floyd’s cycle detection algorithm with slow and fast pointers. If they meet, a cycle exists.”
class Solution2 {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;        // 1 step
            fast = fast.next.next;  // 2 steps

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
public class LinkedListCycle {
    static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution2 sol = new Solution2();
        boolean hasCycle = sol.hasCycle(head);
        System.out.println("Has Cycle? " + hasCycle);
    }
}
