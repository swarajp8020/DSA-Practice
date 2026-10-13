package PREP2025.Practice.Week9Practice;
class Solution1 {
    public ListNode middleList(ListNode head){
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
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        Solution1 sol = new Solution1();
        ListNode newHead = sol.middleList(head);
        printHead(newHead);
    }
    static void printHead(ListNode head){
        while (head != null) {
            System.out.print(head.val +"->");
            head = head.next;
        }
        System.out.println("null");
    }
}
