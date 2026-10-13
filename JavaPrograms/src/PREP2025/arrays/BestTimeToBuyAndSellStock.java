package PREP2025.arrays;

//121. Best Time to Buy and Sell Stock
/// ELI5
/// You want maximum profit.
/// So:
/// buy at the lowest price so far
/// sell at today’s price
/// keep best profit
/// You never need to try all pairs.
/// Normal explanation
/// Maintain:
/// minPrice = minimum value seen up to index i
/// maxProfit = best profit so far
/// At each price:
/// profit if sell today = price - minPrice
/// update maxProfit
/// update minPrice
/// Pattern recognition
/// ✅ “max difference between future and past”
/// → track min so far.

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int p : prices) {
            minPrice = Math.min(minPrice, p);
            maxProfit = Math.max(maxProfit, p - minPrice);
        }
        return maxProfit;
    }
    static void main() {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
