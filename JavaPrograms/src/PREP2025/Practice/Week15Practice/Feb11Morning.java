package PREP2025.Practice.Week15Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Feb11Morning {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c:s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
                (a,b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char c = maxHeap.poll();
            int count = map.get(c);
            for (int i = 0; i < count; i++) {
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
