package PREP2025.arrays;
//LC 198. House Robber https://leetcode.com/problems/house-robber/description/?envType=problem-list-v2&envId=rr2ss0g5
/// ELI5
/// You want max money.
/// But if you rob a house, you cannot rob the next one.
/// At every house:
/// either rob it → add money from i-2
/// or skip it → take money till i-1
/// Pattern
/// dp[i] = max(dp[i-1], nums[i] + dp[i-2])
/// Optimized with two variables.
public class HouseRobber {
    public static int rob(int[] nums) {
        int prev2 = 0, prev1 = 0;
        for (int x : nums) {
            int curr = Math.max(prev1, prev2 + x);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
}
