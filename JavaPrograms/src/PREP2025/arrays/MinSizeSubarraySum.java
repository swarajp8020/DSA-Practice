package PREP2025.arrays;
// LC 209 – Minimum Size Subarray Sum https://leetcode.com/problems/minimum-size-subarray-sum/description/
/// Why this now
/// Sliding Window reinforcement
/// Complements LC 560 (where sliding window fails)
/// Interviewers love this contrast
/// Core idea
/// Expand window to reach target, shrink to minimize length.
public class MinSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    static void main() {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
}
