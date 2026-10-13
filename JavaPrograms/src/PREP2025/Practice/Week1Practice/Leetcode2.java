/*
LeetCode 34: Find First and Last Position of Element in Sorted Array

Difficulty: Medium
Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

Problem statement (simplified)

Given a sorted array of integers nums and a target value, return the starting and ending index of that target number.
If the target is not found, return [-1, -1].

Example

Input:

nums = [5,7,7,8,8,10]
target = 8


Output:

[3, 4]


Explanation:
8 first appears at index 3 and last appears at index 4.
* */

package Week1Practice;

public class Leetcode2 {
    public int[] searchRange(int[] nums, int target) {
        int first= -1;
        int last = -1;
        boolean found = false;
        for (int i=0; i<nums.length;i++){
            if(nums[i] == target){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first, last};
    }
}
