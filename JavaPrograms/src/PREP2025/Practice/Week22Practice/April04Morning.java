package PREP2025.Practice.Week22Practice;

import java.util.HashMap;
import java.util.Map;

/// Subarray Sum Equals K
public class April04Morning {
    public static int subarraySum(int[] numbersArray, int targetSum) {
        Map<Integer, Integer> prefixSumFrequencyMap = new HashMap<>();
        prefixSumFrequencyMap.put(0, 1); // base case
        int currentSum = 0;
        int totalCount = 0;
        for (int currentNumber : numbersArray) {
            currentSum += currentNumber;
            int requiredSum = currentSum - targetSum;
            if (prefixSumFrequencyMap.containsKey(requiredSum)) {
                totalCount += prefixSumFrequencyMap.get(requiredSum);
            }
            prefixSumFrequencyMap.put(
                    currentSum,
                    prefixSumFrequencyMap.getOrDefault(currentSum, 0) + 1
            );
        }
        return totalCount;
    }
    public static void main(String[] args) {
        int[] numbersArray = {1,1,1};
        int targetSum = 2;
        System.out.println(subarraySum(numbersArray, targetSum)); // 2
    }
}
