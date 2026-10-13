package PREP2025.sorting;
/// ELI5 Explanation
/// You have a list of numbers:
/// [1,1,1,2,2,3]
/// And I ask:
/// “Give me the 2 numbers that appear most often.”
/// Step 1: Count frequency
/// 1 → 3 times
/// 2 → 2 times
/// 3 → 1 time
/// Step 2: Pick top 2 by frequency → [1,2]
/// That’s exactly what this problem is.
/// Pattern Identification
/// Whenever you see:
/// • “Top k most frequent”
/// • “Highest frequency”
/// • “Most common elements”
/// Think:
/// 👉 Frequency Map + Heap
/// Approach
/// Build frequency map
/// Use a min-heap of size k based on frequency
/// Return elements from heap
// Interview Explanation (4 lines)
//First I count frequency of each number using a hashmap.
//Then I use a min-heap of size k based on frequency.
//This keeps only the k most frequent elements.
//Finally I return the elements stored in the heap.
//Complexity
//Time: O(n log k)
//Space: O(n)
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(int key : map.keySet()) {
            minHeap.add(key);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        int i = 0;
        while(!minHeap.isEmpty()) {
            result[i++] = minHeap.poll();
        }
        return result;
    }
    static void main() {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
}
