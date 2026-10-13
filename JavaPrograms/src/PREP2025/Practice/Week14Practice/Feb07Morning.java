package PREP2025.Practice.Week14Practice;

import java.util.PriorityQueue;

public class Feb07Morning {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public Feb07Morning(){
        maxHeap = new PriorityQueue<>((a,b)->b - a);
        minHeap = new PriorityQueue<>();
    }
    public void addNum(int num){
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }
        if (maxHeap.size() > minHeap.size() + 1){
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }
    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + maxHeap.peek()) / 2.0;
        }
        return maxHeap.peek();
    }

    static void main(String[] args) {
        Feb07Morning mf = new Feb07Morning();
        int[] nums = {5, 15, 1, 3};
        for (int num: nums) {
            mf.addNum(num);
            System.out.println("added: " + num);
            System.out.println("Current Median: " + mf.findMedian());
            System.out.println("---------------------");
        }
    }
}
