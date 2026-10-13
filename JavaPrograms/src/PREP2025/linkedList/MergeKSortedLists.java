package PREP2025.linkedList;

import java.util.PriorityQueue;

/// LC 23 — Merge K Sorted Lists
/// What the problem asks (plain words)
/// You’re given K sorted linked lists.
/// Example (K = 3):
/// list1: 1 → 4 → 5
/// list2: 1 → 3 → 4
/// list3: 2 → 6
/// You must merge all of them into one sorted list:
/// 1 → 1 → 2 → 3 → 4 → 4 → 5 → 6
/// First important realization (don’t skip this)
/// You already know how to:
/// merge 2 sorted lists (LC 21)
/// LC 23 is basically:
/// “How do I merge more than 2 sorted lists efficiently?”
/// That’s it.
/// There are 3 approaches (you should know 2)
/// ❌ Approach 1: Merge one by one (naive)
/// Merge list1 + list2
/// Then merge result + list3
/// Then + list4 …
/// This works, but it’s slow.
/// Time complexity: O(k * n)
/// Interviewers don’t like this.
/// ✅ Approach 2: Min Heap (Priority Queue) — MOST COMMON
/// Intuition (ELI5)
/// Imagine you have K pointers, one at the start of each list.
/// At every step:
/// Look at the current smallest value
/// Take it
/// Move that list forward
/// A min heap helps you always pick the smallest value quickly.
/// Mental model
/// Heap contains:
/// (head of list1),
/// (head of list2),
/// (head of list3)
/// You: Pop the smallest node,  Add it to result, Push its next node into heap (if exists)
/// Repeat until heap is empty.
/// Why heap works so well
/// Heap size is at most K
/// Each node is inserted & removed once
/// Time:
/// O(n log k)
/// This is optimal.
/// Interview one-liner (memorize this)
/// “I use a min heap to always extract the smallest head among the k lists, then push the next node from that list into the heap.”

class Solution6 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                (a, b) -> a.val - b.val
        );
        // add first node of each list
        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            curr.next = node;
            curr = curr.next;
            if (node.next != null) {
                pq.offer(node.next);
            }
        }
        return dummy.next;
    }
}
public class MergeKSortedLists {
    public static void main(String[] args) {
        // list1: 1 → 4 → 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        // list2: 1 → 3 → 4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        // list3: 2 → 6
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);
        ListNode[] lists = {l1, l2, l3};
        Solution6 sol = new Solution6();
        ListNode merged = sol.mergeKLists(lists);
        printList(merged); // Expected: 1 → 1 → 2 → 3 → 4 → 4 → 5 → 6
    }
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " → ");
            head = head.next;
        }
        System.out.println("null");
    }
}
