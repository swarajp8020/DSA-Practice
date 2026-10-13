package PREP2025.Practice.Week8Practice.prefixHashmap;

import java.util.HashMap;

public class LongestSubarraySumK {
    static void main() {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(longestSubarraySumK(arr,k));
    }
    static int longestSubarraySumK(int[] arr, int k){
        int prefixSum = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (map.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum - k));
            }
            map.putIfAbsent(prefixSum, i);
        }
        return maxLen;
    }
}
