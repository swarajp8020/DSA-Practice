package PREP2025.Practice.Week14Practice;

import java.util.Arrays;

public class Feb03Morning {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount+ 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int c:coins){
                if (i - c >= 0) {
                    dp[i] = Math.min(dp[i], dp[i-c] +1);
                }
            }
        }
        return dp[amount] > amount ? - 1:dp[amount];
    }
    static void main() {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
//    public static boolean canJump(int[] nums) {
//        int farthest = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (i > farthest) return false;
//            farthest = Math.max(farthest, i + nums[i]);
//        }
//        return true;
//    }
//    static void main() {
//        int[] nums = {2,3,1,1,4};
//        System.out.println(canJump(nums));
//    }
}
