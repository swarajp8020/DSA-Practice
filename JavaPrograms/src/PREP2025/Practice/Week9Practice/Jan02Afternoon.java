package PREP2025.Practice.Week9Practice;

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
//class Solution2 {
//    public ListNode middleList(ListNode head){
//        ListNode slow = head;
//        ListNode fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
//}
public class Jan02Afternoon {
    ///  LinkedListCycle

    /// MiddleLinkedList
//    static void main(String[] args) {
//        ListNode head = new ListNode(5);
//        head.next = new ListNode(4);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(2);
//        head.next.next.next.next = new ListNode(1);
//        Solution2 sol = new Solution2();
//        ListNode newHead = sol.middleList(head);
//        printHead(newHead);
//    }
//    static void printHead(ListNode head){
//        while (head != null) {
//            System.out.print(head.val + "->");
//            head = head.next;
//        }
//        System.out.println("null");
//    }
    /// ReverseLinkedlist
//    static void main(String[] args) {
//        ListNode head = new ListNode(5);
//        head.next = new ListNode(4);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(2);
//        head.next.next.next.next = new ListNode(1);
//        Solution2 sol = new Solution2();
//        ListNode newHead = sol.reverseList(head);
//        printHead(newHead);
//    }
//    static void printHead(ListNode head){
//        while (head != null) {
//            System.out.print(head.val + "->");
//            head = head.next;
//        }
//        System.out.println("null");
//    }
}
