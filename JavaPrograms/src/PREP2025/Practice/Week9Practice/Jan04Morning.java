package PREP2025.Practice.Week9Practice;

//
//class Solution4 {
//    public ListNode mergeKLists(ListNode[] lists){
//        PriorityQueue<ListNode> pq = new PriorityQueue<>(
//                (a,b) -> a.val - b.val
//        );
//        for (ListNode node:lists){
//            if (node != null) {
//                pq.offer(node);
//            }
//        }
//        ListNode dummy = new ListNode(0);
//        ListNode curr = dummy;
//        while (!pq.isEmpty()) {
//            ListNode node = pq.poll();
//            curr.next = node;
//            curr = curr.next;
//            if (node.next != null) {
//                pq.offer(node.next);
//            }
//        }
//        return dummy.next;
//    }
//}
//class ListNode2 {
//    int val;
//    ListNode2 next;
//    ListNode2(int val){
//        this.val = val;
//        this.next = null;
//    }
//}
//class Solution4{
//    public ListNode2 reverseList(ListNode2 head){
//        ListNode2 prev = null;
//        ListNode2 curr = head;
//        while (curr != null) {
//            ListNode2 next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }
//}
//class Solution4 {
//    // Build list: 1 → 2 → 3 → 4 → 5
//    public ListNode removeNthFromEnd(ListNode head, int n){
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode slow = dummy;
//        ListNode fast = dummy;
//        for (int i = 0; i < n; i++) {
//            fast = fast.next;
//        }
//        while (fast.next != null) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//        slow.next = slow.next.next;
//        return dummy.next;
//    }
//}
//middleLinkedList
//class Solution4 {
//    public ListNode middleList(ListNode head){
//        ListNode slow = head;
//        ListNode fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//        return slow;
//    }
//}
//MergeTwoSortedLists
class Solution4 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
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

public class Jan04Morning {
        public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // list2: 2 → 4 → 6
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        Solution4 sol = new Solution4();
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
//    static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        Solution1 sol = new Solution1();
//        ListNode newHead = sol.middleList(head);
//        // Print reversed list
//        printList(newHead);
//    }
//    static void printList(ListNode head) {
//        while (head != null) {
//            System.out.print(head.val + " -> ");
//            head = head.next;
//        }
//        System.out.println("null");
//    }
//        static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//
//        Solution4 sol = new Solution4();
//        ListNode newHead =
//
//        printList(newHead); // Expected: 1 → 2 → 3 → 5
//    }
//
//    static void printList(ListNode head) {
//        while (head != null) {
//            System.out.print(head.val + " → ");
//            head = head.next;
//        }
//        System.out.println("null");
//    }
//    static void main(String[] args) {
//        ListNode2 head = new ListNode2(1);
//        head.next = new ListNode2(2);
//        head.next.next = new ListNode2(3);
//        head.next.next.next = new ListNode2(4);
//        head.next.next.next.next = new ListNode2(5);
//        Solution4 sol = new Solution4();
//        ListNode2 newHead = sol.reverseList(head);
//        // Print reversed list
//        printList(newHead);
//    }
//    static void printList(ListNode2 head){
//        while (head != null){
//            System.out.print(head.val + "->");
//            head = head.next;
//        }
//        System.out.println("null");
//    }
//    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(5);
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(4);
//        ListNode l3 = new ListNode(2);
//        l3.next = new ListNode(6);
//        ListNode[] lists = {l1, l2, l3};
//        Solution4 sol = new Solution4();
//        ListNode merged = sol.mergeKLists(lists);
//        printList(merged); // Expected: 1 → 1 → 2 → 3 → 4 → 4 → 5 → 6
//    }
//    static void printList(ListNode head) {
//        while (head != null) {
//            System.out.print(head.val + " → ");
//            head = head.next;
//        }
//        System.out.println("null");
//    }

}
