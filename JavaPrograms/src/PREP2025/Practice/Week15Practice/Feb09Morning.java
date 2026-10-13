package PREP2025.Practice.Week15Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Feb09Morning {
    //TopKFrequent
    public static int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                (a,b) -> map.get(a) - map.get(b)
        );
        for (int key: map.keySet()) {
            minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        int i = 0;
        while (!minHeap.isEmpty()) {
            result[i++] = minHeap.poll();
        }
        return result;
    }
    static void main() {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
    //Kth Largest Element in an Array
//    public static int findKthLargest(int[] nums, int k) {
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//        for (int num: nums) {
//            minHeap.add(num);
//            if (minHeap.size() > k) {
//                minHeap.poll();
//            }
//        } return minHeap.peek();
//    }
//
//    static void main(String[] args) {
//        int[] arr = {8,5,7,2,9,3};
//        int k = 3;
//        System.out.println(findKthLargest(arr, k));
//    }
}
