package PREP2025.linkedList;
// 206. Reverse Linked List - https://leetcode.com/problems/reverse-linked-list/description/
/// Common interview questions (you should answer calmly)
/// Q: Why do we need next?
/// Because once we reverse curr.next, the original forward link is lost.
/// Q: Why return prev and not head?
/// Because head becomes the tail after reversal.
/// prev ends at the new head.
/// Q: Time and space complexity?
/// Time: O(n), Space: O(1)
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Create linked list: 1 → 2 → 3 → 4 → 5 → null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution sol = new Solution();
        ListNode newHead = sol.reverseList(head);
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
