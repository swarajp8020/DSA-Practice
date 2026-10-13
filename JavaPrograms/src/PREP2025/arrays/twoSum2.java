package PREP2025.arrays;
//LC 167 – Two Sum II (Input Array Is Sorted) https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

/// ELI5
/// Array is sorted.
/// Pick one number from left, one from right.
/// If sum is too small → move left forward
/// If sum is too big → move right backward
/// Pattern
/// Two pointers on sorted array
public class twoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
