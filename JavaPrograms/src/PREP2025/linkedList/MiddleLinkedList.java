package PREP2025.linkedList;
// Middle of the Linked List - https://leetcode.com/problems/middle-of-the-linked-list/description/
/// What the problem asks (plain words)
/// Given a linked list, return the middle node.
/// If there are two middle nodes (even length), return the second one.
/// Example:
/// 1 → 2 → 3 → 4 → 5 → null
/// middle = 3
/// 1 → 2 → 3 → 4 → null
/// middle = 3   (second middle)
/// Why this problem exists
/// This problem teaches you:
/// how to move at different speeds
/// how to find the middle without knowing the length
/// how pointers can solve problems PREP2025.arrays need extra work for
/// This is core linked list thinking.
/// The key idea (ELI5)
/// You use two people walking on the list:
/// 🐢 slow → moves 1 step at a time
/// 🐇 fast → moves 2 steps at a time
/// When the fast one reaches the end,
/// the slow one will be standing in the middle.
/// Why this works (intuition)
/// Imagine a race track:
/// Fast runs twice as fast as slow, When fast finishes the race, slow has covered half the distance
// Interview questions they might ask
/// Q: Why not count length first?
/// That takes two passes. This does it in one pass.
/// Q: Time and space complexity?
/// Time: O(n) Space: O(1)
/// Q: Why does it return the second middle in even cases?
/// Because slow moves after fast, and loop condition allows it.
/// One sentence to remember forever
/// “I use two pointers, where the fast pointer moves twice as fast as the slow pointer, so when fast reaches the end, slow is at the middle.”
class Solution1 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
public class MiddleLinkedList {
    static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution1 sol = new Solution1();
        ListNode newHead = sol.middleNode(head);
        // Print reversed list
        printList(newHead);
    }
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
