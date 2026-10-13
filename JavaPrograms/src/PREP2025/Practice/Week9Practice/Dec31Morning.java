package PREP2025.Practice.Week9Practice;
class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int val){
        this.val = val;
        this.next = null;
    }
}
//class Solu {
//    public ListNode1 reverseList(ListNode1 head){
//        ListNode1 prev = null;
//        ListNode1 curr = head;
//        while (curr != null) {
//            ListNode1 next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }
//}
//class Sol {
//    public ListNode1 middleList(ListNode1 head){
//        ListNode1 slow = head;
//        ListNode1 fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
//}
//class Sol {
//    public boolean hasCycle(ListNode head){
//        if (head == null) return false;
//        ListNode slow = head;
//        ListNode fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if (slow == fast) return true;
//        }
//        return false;
//    }
//}
//class Sol {
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
class Solu {

}
public class Dec31Morning {
    static void main(String[] args) {

    }
    /// LinkedListCycle2
//    static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//
//        // CREATE CYCLE: 5 → 3
//        head.next.next.next.next.next = head.next.next;
//
//        Sol sol = new Sol();
//        ListNode cycleStart = sol.detectCycle(head);
//
//        if (cycleStart != null) {
//            System.out.println("Cycle starts at node with value: " + cycleStart.val);
//        } else {
//            System.out.println("No cycle detected");
//        }
//    }

    /// LinkedListCycle
//    static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        Sol dec = new Sol();
//        boolean hasCyclce = dec.hasCycle(head);
//        System.out.println("Has Cycle? "+ hasCyclce);
//    }
    /// MiddleLinkedList
//    static void main(String[] args) {
//        ListNode1 head = new ListNode1(5);
//        head.next = new ListNode1(4);
//        head.next.next = new ListNode1(3);
//        head.next.next.next = new ListNode1(2);
//        head.next.next.next.next = new ListNode1(1);
//        Sol solu = new Sol();
//        ListNode1 newHead = solu.middleList(head);
//        printHead(newHead);
//    }
//    static void printHead(ListNode1 head){
//        while (head != null){
//            System.out.print(head.val + "->");
//            head = head.next;
//        }
//        System.out.println("null");
//    }

    /// ReverseLinkedList
//    static void main(String[] args) {
//        ListNode1 head = new ListNode1(5);
//        head.next = new ListNode1(4);
//        head.next.next = new ListNode1(3);
//        head.next.next.next = new ListNode1(2);
//        head.next.next.next.next = new ListNode1(1);
//        Solu solu = new Solu();
//        ListNode1 newHead = solu.reverseList(head);
//        printHead(newHead);
//    }
//    static void printHead(ListNode1 head){
//        while (head != null){
//            System.out.print(head.val + "->");
//            head = head.next;
//        }
//        System.out.println("null");
//    }
}
