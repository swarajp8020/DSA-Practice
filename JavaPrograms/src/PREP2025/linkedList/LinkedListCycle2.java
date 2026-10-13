package PREP2025.linkedList;
// LC 142 — Linked List Cycle II https://leetcode.com/problems/linked-list-cycle-ii/description/
/// What the problem asks (plain words)
/// You already know how to detect if a cycle exists.
/// Now the question is:
/// Where does the cycle start?
/// Not “is there a cycle”, but:
/// 👉 Which node starts the loop?
/// First, remember what you already know
/// From LC 141, you learned:
/// Use slow (1 step) and fast (2 steps)
/// If they meet → cycle exists
/// That part does not change.
/// New question (this is the only new thing)
/// Once slow and fast meet inside the cycle:
/// How do we find the first node of the cycle?
/// ELI5 STORY (VERY IMPORTANT)
/// Imagine a circular running track.
/// You start walking from the gate
/// Your friend starts running faster
/// You meet somewhere inside the track, not necessarily at the gate
/// Now the trick is:
/// 👉 If you both start walking one step at a time,
/// you will meet again exactly at the gate.
/// That gate is the start of the cycle.
/// How this translates to linked lists
/// Step 1: Detect the cycle (same as LC 141)
/// slow = head
/// fast = head
/// Move:
/// slow → 1 step
/// fast → 2 steps
/// They meet somewhere inside the loop.
/// Step 2: Reset ONE pointer to head
/// When they meet:
/// Move slow back to head
/// Keep fast where it is
/// Step 3: Move BOTH at same speed
/// Now move both one step at a time:
/// slow = slow.next
/// fast = fast.next
/// Where they meet now 👉 cycle start
/// WHY THIS WORKS (INTUITION, NOT MATH)
/// Let:
/// A = distance from head to cycle start
/// B = distance from cycle start to meeting point
/// C = remaining cycle length
/// Fast moves twice as fast, so:
/// By the time they meet, fast has done extra loops
/// That extra distance lines up perfectly so that:
/// Resetting slow to head makes both pointers reach the cycle start together.
/// You do not need to derive this in interviews.
/// You just need to understand the movement.
/// Step-by-step example
/// List:
/// 1 → 2 → 3 → 4 → 5
///       ↑         ↓
///       ← ← ← ← ←
/// Phase 1: Detect cycle
/// slow & fast meet at node 4
/// Phase 2: Reset slow
/// slow = 1
/// fast = 4
/// Phase 3: Move together
/// slow = 2
/// fast = 5
/// slow = 3
/// fast = 3   ← meet here
/// 👉 Node 3 is the cycle start.
/// Interview one-liner (MEMORIZE THIS)
/// “After detecting the cycle using slow and fast pointers, I reset one pointer to the head and move both one step at a time. The node where they meet is the start of the cycle.”
/// That sentence is gold.
/// Quick self-check (important)
/// Do we use extra memory? ❌
/// Do we modify the list? ❌
/// Time complexity? O(n), Space complexity? O(1)
class Solution3 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        // Phase 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // Phase 2: Find cycle start
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // cycle start
            }
        }
        return null; // no cycle
    }
}

public class LinkedListCycle2 {
    static void main(String[] args) {

        // Build list: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // CREATE CYCLE: 5 → 3
        head.next.next.next.next.next = head.next.next;

        Solution3 sol = new Solution3();
        ListNode cycleStart = sol.detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected");
        }
    }
}
