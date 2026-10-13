package PREP2025.prefix;

import java.util.HashMap;

public class LongestSubarraySumK {
    static void main() {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(longestSubarraySumK(arr,k));
    }
    static int longestSubarraySumK(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;

        map.put(0, -1); // base case

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (map.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum - k));
            }

            // store first occurrence only
            map.putIfAbsent(prefixSum, i);
        }
        return maxLen;
    }

}
