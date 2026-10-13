package PREP2025.Practice.Week21Practice;

import java.util.ArrayList;
import java.util.List;

/// Combination Sum
public class March29Morning {
    public static List<List<Integer>> combinationSum(int[] candidatesArray, int targetValue) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(candidatesArray, targetValue, 0, new ArrayList<>(), resultList);
        return resultList;
    }

    private static void backtrack(
            int[] candidatesArray,
            int remainingTarget,
            int startIndex,
            List<Integer> currentCombination,
            List<List<Integer>> resultList) {
        if (remainingTarget == 0) {
            resultList.add(new ArrayList<>(currentCombination));
            return;
        }
        if (remainingTarget < 0) {
            return;
        }
        for (int currentIndex = startIndex; currentIndex < candidatesArray.length; currentIndex++) {
            int currentNumber = candidatesArray[currentIndex];
            currentCombination.add(currentNumber);
            // stay on same index (reuse allowed)
            backtrack(
                    candidatesArray,
                    remainingTarget - currentNumber,
                    currentIndex,
                    currentCombination,
                    resultList
            );
            // backtrack
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    static void main(String[] args) {
        int[] candidatesArray = {2,3,6,7};
        int targetValue = 7;
        System.out.println(combinationSum(candidatesArray, targetValue));
    }
}
