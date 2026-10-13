package PREP2025.arrays;
//

import java.util.Arrays;

/// ELI5
/// Given coins like [1,2,5], find minimum coins to make amount n.
/// Pattern
/// Classic DP:
/// dp[i] = min coins to make amount i
/// For every coin, try reducing the amount.
public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int c : coins) {
                if (i - c >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - c] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    static void main() {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}
