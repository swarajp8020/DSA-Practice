package PREP2025.Practice.Week10Practice;
//reverseLinkedList
//class Solution2 {
//    public ListNode reverseList(ListNode head){
//        ListNode prev = null;
//        ListNode curr = head;
//        while (curr != null) {
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }
//}
/// removeNthFromEnd
//class Solution2 {
//    public ListNode removeNthFromEnd(ListNode head, int n){
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode slow = dummy;
//        ListNode fast = dummy;
//        for (int i = 0; i < n; i++) {
//            fast = fast.next;
//        }
//        while (fast != null) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//        slow.next = slow.next.next;
//        return dummy.next;
//    }
//}

import java.util.PriorityQueue;

/// MiddleLinkedList
//class Solution2 {
//    public ListNode middleNode(ListNode head){
//        ListNode slow = head;
//        ListNode fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
//}
/// mergeTwoLists
//class Solution2 {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
//        ListNode dummy = new ListNode(0);
//        ListNode curr = dummy;
//        while (list1 != null && list2 != null) {
//            if (list1.value <= list2.value) {
//                curr.next = list1;
//                list1 = list1.next;
//            } else {
//                curr.next = list2;
//                list2 = list2.next;
//            }
//            curr = curr.next;
//        }
//        curr.next = (list1 != null) ? list1 : list2;
//        return dummy.next;
//    }
//}
/// MergeKSortedLists
class Solution2 {
    public ListNode mergeKLists(ListNode[] lists){
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                (a,b) -> a.value - b.value
        );
        for (ListNode node:lists) {
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


public class Dec7Morning {
    static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);
        ListNode[] lists = {l1, l2, l3};
        Solution2 sol = new Solution2();
        ListNode merged = sol.mergeKLists(lists);
        printList(merged);
    }
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + " → ");
            head = head.next;
        }
        System.out.println("null");
    }
//    static void main(String[] args) {
//        ListNode list1 = new ListNode(1);
//        list1.next = new ListNode(2);
//        list1.next.next = new ListNode(4);
//        ListNode list2 = new ListNode(1);
//        list2.next = new ListNode(3);
//        list2.next.next = new ListNode(4);
//        Solution2 sol = new Solution2();
//        ListNode merged = sol.mergeTwoLists(list1, list2);
//        printList(merged);
//    }
//    static void printList(ListNode head) {
//        while (head != null) {
//            System.out.print(head.value + " → ");
//            head = head.next;
//        }
//        System.out.println("null");
//    }
//    static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        Solution2 sol = new Solution2();
//        ListNode newHead = sol.middleNode(head);
//        // Print reversed list
//        printList(newHead);
//    }
//    static void printList(ListNode head) {
//        while (head != null) {
//            System.out.print(head.value + " -> ");
//            head = head.next;
//        }
//        System.out.println("null");
//    }
//    static void main(String[] args) {
//        // Build list: 1 → 2 → 3 → 4 → 5
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//
//        Solution2 sol = new Solution2();
//        ListNode newHead = sol.removeNthFromEnd(head, 2);
//
//        printList(newHead); // Expected: 1 → 2 → 3 → 5
//    }
//
//    static void printList(ListNode head) {
//        while (head != null) {
//            System.out.print(head.value + " → ");
//            head = head.next;
//        }
//        System.out.println("null");
//    }

//    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        Solution2 sol = new Solution2();
//        ListNode newHead = sol.reverseList(head);
//        printList(newHead);
//    }
//    static void printList(ListNode head) {
//        while (head != null) {
//            System.out.print(head.value + " -> ");
//            head = head.next;
//        }
//        System.out.println("null");
//    }
}
