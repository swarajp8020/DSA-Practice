package PREP2025.linkedList;
// 19. Remove Nth Node From End of List https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/?envType=problem-list-v2&envId=rr2ss0g5
/// What the problem asks - You’re given a linked list and a number n.
/// You must remove the nth node from the end and return the head.
/// Example:
/// 1 → 2 → 3 → 4 → 5
/// n = 2
/// Remove 4 → result:
/// 1 → 2 → 3 → 5
/// Why this is tricky (and why it’s important)
/// You don’t know the length.
/// So you can’t:
/// count nodes first
/// then go to length - n
/// Interviewers want:
/// 👉 one pass
/// 👉 no length calculation
/// The core trick (simple words)
/// We again use two pointers.
/// But this time:
/// fast gets a head start
/// slow follows behind
/// The distance between them is exactly n.
/// Step-by-step mental model
/// Step 0: Dummy node (THIS IS IMPORTANT)
/// We create a fake node before head.
/// Why?
/// To handle cases like “remove first node”
/// It simplifies everything
/// dummy → 1 → 2 → 3 → 4 → 5
/// Step 1: Move fast n steps ahead
/// If n = 2:
/// fast at 3
/// slow at dummy
/// Step 2: Move both together
/// Move slow & fast one step at a time until fast reaches the end.
/// When fast is at the last node:
/// slow is just before the node to remove
/// Step 3: Remove the node
/// slow.next = slow.next.next;
/// That’s it.
/// One sentence you should memorize
/// “I use a dummy node and two pointers with a fixed gap so that when the fast pointer reaches the end, the slow pointer is just before the node to remove.”
class Solution4 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        // move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // move both until fast reaches end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // remove nth node
        slow.next = slow.next.next;
        return dummy.next;
    }
}
public class RemoveNthFromEnd {
    static void main(String[] args) {
        // Build list: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution4 sol = new Solution4();
        ListNode newHead = sol.removeNthFromEnd(head, 2);

        printList(newHead); // Expected: 1 → 2 → 3 → 5
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " → ");
            head = head.next;
        }
        System.out.println("null");
    }
}
