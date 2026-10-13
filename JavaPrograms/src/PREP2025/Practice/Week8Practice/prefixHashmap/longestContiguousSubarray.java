package PREP2025.Practice.Week8Practice.prefixHashmap;

import java.util.HashMap;

public class longestContiguousSubarray {
    static void main() {
        int[] nums = {0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(nums));
    }
    static int findMaxLength(int[] nums){
        int maxLen = 0, prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            prefixSum += (nums[i]==0?-1:1);
            if (map.containsKey(prefixSum)) {
                maxLen = Math.max(maxLen, i-map.get(prefixSum));
            } else map.put(prefixSum, i);
        }
        return maxLen;
    }
}
