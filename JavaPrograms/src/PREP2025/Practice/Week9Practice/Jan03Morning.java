package PREP2025.Practice.Week9Practice;
///// Linkedlistcycle
//class Solution2 {
//    public boolean hasCycle(ListNode head){
//        if (head == null) return false;
//        ListNode slow = head;
//        ListNode fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if (slow == fast) {
//                return true;
//            }
//        }
//        return false;
//    }
//}
//class Solution2 {
//    public ListNode detectCycle(ListNode head){
//        if (head == null) return null;
//        ListNode slow = head;
//        ListNode fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if (slow == fast) {
//                slow = head;
//                while (slow != fast) {
//                    slow = slow.next;
//                    fast = fast.next;
//                }
//                return slow;
//            }
//        }
//        return null;
//    }
//}
//class Solution2 {
//    public ListNode removeNthFromEnd(ListNode head, int n){
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode slow = dummy;
//        ListNode fast = dummy;
//        for (int i = 0; i < n; i++) {
//            fast = fast.next;
//        }
//        while (fast.next != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        slow.next = slow.next.next;
//        return dummy.next;
//    }
//}
class Solution2 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
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
public class Jan03Morning {
    static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        Solution2 sol = new Solution2();
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
//        Solution2 sol = new Solution2();
//        ListNode newHead = sol.removeNthFromEnd(head, 2);
//        printList(newHead);
//    }
//    static void printList(ListNode head) {
//        while (head != null) {
//            System.out.print(head.val + " → ");
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
//        head.next.next.next.next.next = head.next.next;
//        Solution2 sol = new Solution2();
//        ListNode cycleStart = sol.detectCycle(head);
//        if (cycleStart != null) {
//            System.out.println("Cycle starts at node with value: " + cycleStart.val);
//        } else {
//            System.out.println("no cycle detected");
//        }
//    }
}
