//LeetCode 34: Find First and Last Position of Element in Sorted Array
//
//Difficulty: Medium
//Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//
//Problem statement (simplified)
//
//Given a sorted array of integers nums and a target value, return the starting and ending index of that target number.
//If the target is not found, return [-1, -1].
//
//Example
//
//Input:
//
//nums = [5,7,7,8,8,10]
//target = 8
//
//
//Output:
//
//        [3, 4]
//
//
//Explanation:
//        8 first appears at index 3 and last appears at index 4.
//        * */
package PREP2025.Practice.todolater;

public class SearchInRangeArrayLeetcode {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstOccurence(nums,target),lastOccurence(nums,target)};
    }

    public static int firstOccurence(int[] arr, int x) {
        int ans = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    // Time Complexity : O(logn)
    // Space Complexity : O(1)
    public static int lastOccurence(int[] arr, int x) {
        int ans = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
