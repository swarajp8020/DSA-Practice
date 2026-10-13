package PREP2025.priorityQueue;
// Sort Characters By Frequency
/// ELI5 Explanation
/// Imagine you put all characters into buckets based on how many times they appear.
/// Then you pour out the buckets from biggest to smallest.
/// That’s exactly:
/// 👉 Frequency counting + max heap
/// Pattern Identification
/// Whenever you see:
/// • “sort by frequency”
/// • “most frequent characters first”
/// Think:
/// PREP2025.HashMap + Max Heap
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> maxHeap =
                new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());
        StringBuilder result = new StringBuilder();
        while(!maxHeap.isEmpty()) {
            char c = maxHeap.poll();
            int count = map.get(c);
            for(int i = 0; i < count; i++) {
                result.append(c);
            }
        }
        return result.toString();
    }
    static void main(String[] args) {
        String input = "tree";
        System.out.println("Output: " + frequencySort(input));
    }
}
