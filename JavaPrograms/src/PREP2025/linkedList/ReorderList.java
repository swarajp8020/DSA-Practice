package PREP2025.linkedList;
// LC 143 - Reorder List https://leetcode.com/problems/reorder-list/description/?envType=problem-list-v2&envId=rr2ss0g5
///What the problem asks (plain words)
/// Given a linked list:
/// 1 → 2 → 3 → 4 → 5
/// Reorder it like this:
/// 1 → 5 → 2 → 4 → 3
/// Rules:
/// You cannot create new nodes
/// You must rearrange pointers
/// Modify the list in place
/// The key realization (VERY IMPORTANT)
/// This problem is exactly 3 problems glued together:
/// Find the middle of the list
/// Reverse the second half
/// Merge the two halves alternately
/// You have already solved all three separately.
/// That’s why we waited before doing this.
/// Step-by-step mental model (ELI5)
/// Let’s take:
/// 1 → 2 → 3 → 4 → 5
/// ✅ Step 1: Find the middle (LC 876)
/// Using slow & fast pointers:
/// slow ends at 3
/// So we split:
/// First half:  1 → 2 → 3
/// Second half: 4 → 5
/// ✅ Step 2: Reverse the second half (LC 206)
/// Reverse:
/// 4 → 5
/// Becomes:
/// 5 → 4
/// Now we have:
/// l1 = 1 → 2 → 3
/// l2 = 5 → 4
/// ✅ Step 3: Merge alternately (LC 21-style merge)
/// We interleave:
/// 1 → 5 → 2 → 4 → 3
/// Done.
/// Why this works (intuition)
/// First half gives order from the start
/// Reversed second half gives order from the end
/// Alternating merge stitches them together
/// No extra memory. Just pointer rewiring.
/// One thing people miss (IMPORTANT)
/// Before reversing, you MUST cut the list:
/// slow.next = null;
/// Otherwise, you’ll create a cycle.
/// Time & Space (say confidently)
/// Time: O(n)
/// Space: O(1)
/// Interview explanation (THIS IS GOLD)
/// Say this calmly:
/// “I split the list into two halves using slow and fast pointers, reverse the second half, then merge the two lists alternately. All operations are done in place.”
class Solution7 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        // 1. Find middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 2. Reverse second half
        ListNode second = reverse(slow.next);
        slow.next = null; // cut the list
        // 3. Merge alternately
        ListNode first = head;
        while (second != null) {
            ListNode t1 = first.next;
            ListNode t2 = second.next;
            first.next = second;
            second.next = t1;
            first = t1;
            second = t2;
        }
    }
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
public class ReorderList {
    static void main(String[] args) {
        // Build list: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution7 sol = new Solution7();
        sol.reorderList(head);

        printList(head); // Expected: 1 → 5 → 2 → 4 → 3
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " → ");
            head = head.next;
        }
        System.out.println("null");
    }
}
