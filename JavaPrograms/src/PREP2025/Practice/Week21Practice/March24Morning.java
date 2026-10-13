package PREP2025.Practice.Week21Practice;
/// House Robber II

public class March24Morning {
    public static int rob(int[] moneyArray) {
        if (moneyArray.length == 1) {
            return moneyArray[0];
        }
        int excludeLast = robLinear(moneyArray, 0, moneyArray.length - 2);
        int excludeFirst = robLinear(moneyArray, 1, moneyArray.length - 1);
        return Math.max(excludeLast, excludeFirst);
    }
    private static int robLinear(int[] moneyArray, int startIndex, int endIndex) {
        int previousTwo = 0; // dp[i-2]
        int previousOne = 0; // dp[i-1]
        for (int currentIndex = startIndex; currentIndex <= endIndex; currentIndex++) {
            int currentHouseMoney = moneyArray[currentIndex];
            int takeCurrent = currentHouseMoney + previousTwo;
            int skipCurrent = previousOne;
            int currentMax = Math.max(takeCurrent, skipCurrent);
            previousTwo = previousOne;
            previousOne = currentMax;
        }
        return previousOne;
    }
    static void main(String[] args) {
        int[] moneyArray = {2,3,2};
        System.out.println(rob(moneyArray)); // 3
    }
}
