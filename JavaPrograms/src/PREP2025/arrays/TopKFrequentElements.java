package PREP2025.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
// LC 347. Top K Frequent Elements https://leetcode.com/problems/top-k-frequent-elements/description/?envType=problem-list-v2&envId=rr2ss0g5
/// ELI5
/// Count frequency of each number.
/// Then pick the top k most frequent.
/// Pattern recognition
/// This is PREP2025.HashMap + Heap (PriorityQueue).
/// PREP2025.HashMap: number → frequency
/// Heap: keep elements ordered by frequency

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> freq.get(b) - freq.get(a) // max heap by frequency
        );
        pq.addAll(freq.keySet());
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
    static void main() {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
}
