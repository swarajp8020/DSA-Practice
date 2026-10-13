package PREP2025.priorityQueue;

import java.util.PriorityQueue;
// Find Kth Largest Element in a Stream
/// ELI5 Explanation
/// Think of it like this:
/// You are maintaining a live leaderboard.
/// Only the top k scores matter.
/// Whenever a new score comes:
/// • If it’s big enough → it enters the leaderboard
/// • If not → ignore it
/// At any moment, the smallest value inside that leaderboard is the kth largest overall.
/// That leaderboard = Min Heap of size k
/// Pattern Identification
/// Whenever you see:
/// • streaming data
/// • online queries
/// • maintain kth largest dynamically
/// Think:
/// 👉 Min Heap of fixed size k
/// Approach
/// Keep a min-heap
/// Add elements one by one
/// If heap size > k → remove smallest
/// Top of heap is always kth largest

public class KthLargestElementStream {
    PriorityQueue<Integer> minHeap;
    int k;
    public KthLargestElementStream(int k, int[] nums) {
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
        KthLargestElementStream obj = new KthLargestElementStream(k, nums);
        System.out.println(obj.add(3));   // 4
        System.out.println(obj.add(5));   // 5
        System.out.println(obj.add(10));  // 5
        System.out.println(obj.add(9));   // 8
        System.out.println(obj.add(4));   // 8
    }
}
