package PREP2025.arrays;
// LC 53 – Maximum Subarray (Kadane’s Algorithm) https://leetcode.com/problems/maximum-subarray/description/?envType=problem-list-v2&envId=rr2ss0g5
/// At every index, decide: start fresh or extend previous subarray.
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
