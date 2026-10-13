package PREP2025.Practice.Week15Practice;

import java.util.PriorityQueue;

public class Feb12Morning {
    PriorityQueue<Integer> minHeap;
    int k;
    public Feb12Morning(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for(int num : nums) {
            add(num);
        }
    }
    public int add(int val) {
        minHeap.add(val);

        if(minHeap.size() > k) {
            minHeap.poll();
        }

        return minHeap.peek();
    }
    static void main(String[] args) {
        int k = 3;
        int[] nums = {4,5,8,2};
        Feb12Morning obj = new Feb12Morning(k, nums);
        System.out.println(obj.add(3));   // 4
        System.out.println(obj.add(5));   // 5
        System.out.println(obj.add(10));  // 5
        System.out.println(obj.add(9));   // 8
        System.out.println(obj.add(4));   // 8
    }
}
