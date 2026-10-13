package PREP2025.Practice.Week15Practice;

import java.util.Arrays;
import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
public class Feb10Morning {
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1])
        );
        for (int[] point: points) {
            maxHeap.add(point);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        int[][] result = new int[k][2];
        int i = 0;
        while (!maxHeap.isEmpty()) {
            result[i++] = maxHeap.poll();
        } return result;
    }

    static void main(String[] args) {
        int[][] points = {
                {1,3},
                {-2,2},
                {5,8},
                {0,1}
        };
        int k = 2;
        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }

    // merge k sorted lists
//    public static ListNode mergeKLists(ListNode[] lists) {
//        PriorityQueue<ListNode> minHeap =
//                new PriorityQueue<>((a, b) -> a.val - b.val);
//        for(ListNode node : lists) {
//            if(node != null) {
//                minHeap.add(node);
//            }
//        }
//        ListNode dummy = new ListNode(0);
//        ListNode curr = dummy;
//        while(!minHeap.isEmpty()) {
//            ListNode node = minHeap.poll();
//            curr.next = node;
//            curr = curr.next;
//            if(node.next != null) {
//                minHeap.add(node.next);
//            }
//        }
//        return dummy.next;
//    }
//    public static void main(String[] args) {
//        ListNode a = new ListNode(1);
//        a.next = new ListNode(4);
//        a.next.next = new ListNode(7);
//        ListNode b = new ListNode(2);
//        b.next = new ListNode(5);
//        b.next.next = new ListNode(8);
//        ListNode c = new ListNode(3);
//        c.next = new ListNode(6);
//        c.next.next = new ListNode(9);
//        ListNode[] lists = {a, b, c};
//        ListNode res = mergeKLists(lists);
//        while(res != null) {
//            System.out.print(res.val + " ");
//            res = res.next;
//        }
//    }
}
