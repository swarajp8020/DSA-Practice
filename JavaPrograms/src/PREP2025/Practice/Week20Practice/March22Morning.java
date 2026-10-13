package PREP2025.Practice.Week20Practice;

import java.util.Arrays;
/// Longest Increasing Subsequence
public class March22Morning {
    public static int lengthOfLIS(int[] numbersArray) {
        int[] dpArray = new int[numbersArray.length];
        Arrays.fill(dpArray, 1);
        int maximumLength = 1;
        for (int currentIndex = 0; currentIndex < numbersArray.length; currentIndex++) {
            for (int previousIndex = 0; previousIndex < currentIndex; previousIndex++) {
                if (numbersArray[previousIndex] < numbersArray[currentIndex]) {
                    dpArray[currentIndex] = Math.max(
                            dpArray[currentIndex],
                            dpArray[previousIndex] + 1
                    );
                }
            }
            maximumLength = Math.max(maximumLength, dpArray[currentIndex]);
        }
        return maximumLength;
    }
    public static void main(String[] args) {
        int[] numbersArray = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(numbersArray)); // 4
    }
}
