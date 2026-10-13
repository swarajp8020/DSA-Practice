package PREP2025.linkedList;
/// Merge Two Sorted Lists - https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=problem-list-v2&envId=rr2ss0g5
/// What the problem asks
/// You’re given two sorted linked lists.
/// Example:
/// list1: 1 → 3 → 5
/// list2: 2 → 4 → 6
/// You must merge them into one sorted list:
/// 1 → 2 → 3 → 4 → 5 → 6
/// You’re not creating new nodes (except a dummy).
/// You’re just rewiring pointers.
/// The mental model (important)
/// Think of it like zipping two sorted lines together.
/// You always:
/// look at the heads of both lists
/// pick the smaller one
/// move that pointer forward
/// Repeat until one list ends.
/// Why we use a dummy node (again)
/// Same reason as LC 19.
/// dummy → ?
/// Dummy helps:
/// avoid special cases
/// always have a “previous” pointer
/// keep code clean
/// Step-by-step logic (slow and clear)
/// Step 1: Setup
/// dummy → null
/// curr = dummy
/// l1 = list1
/// l2 = list2
/// Step 2: Compare & attach
/// While both lists exist:
/// if l1.val <= l2.val
/// attach l1
/// move l1
/// else
/// attach l2
/// move l2
/// Always move curr.
/// Step 3: Attach the rest
/// One list will still have nodes left.
/// Attach it directly:
/// curr.next = l1 OR l2
/// No loop needed anymore.
/// One sentence for interviews (memorize this)
/// “I use a dummy node and a pointer to iteratively compare and attach the smaller node from the two lists, then append the remaining list.”
class Solution5 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }
}
public class MergeTwoSortedLists {
    static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // list2: 2 → 4 → 6
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        Solution5 sol = new Solution5();
        ListNode merged = sol.mergeTwoLists(list1, list2);

        printList(merged);
    }
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " → ");
            head = head.next;
        }
        System.out.println("null");
    }
}
