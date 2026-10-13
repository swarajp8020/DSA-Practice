package PREP2025.prefix;

import java.util.HashMap;
    /// 525. Contiguous Array LC https://leetcode.com/problems/contiguous-array/description/
public class longestContiguousSubarray {
    static void main() {
        int[] nums = {0,1};
        System.out.println(findMaxLength(nums));
    }
    static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;

        map.put(0, -1); // base case

        for (int i = 0; i < nums.length; i++) {
            prefixSum += (nums[i] == 0 ? -1 : 1);

            if (map.containsKey(prefixSum)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i); // store first occurrence
            }
        }
        return maxLen;
    }

}
