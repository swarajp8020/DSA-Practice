package PREP2025.hashing_and_sets;

// LC 128. Longest Consecutive Sequence https://leetcode.com/problems/longest-consecutive-sequence/description/

import java.util.HashSet;

/// ELI5
/// You have numbers.
/// You want the longest chain like:
/// 1,2,3,4 (consecutive)
/// You’re NOT allowed to sort (PREP2025.sorting = O(n log n)).
/// We want O(n).
/// Core trick
/// Put all numbers into a HashSet.
/// Then for each number:
/// Only start counting if it is the start of a sequence
/// Meaning: (num - 1) is NOT in the set
/// Then count forward:
/// num, num+1, num+2...

public class longestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);
        int longest = 0;
        for (int x : set) {
            // only start if x is the beginning
            if (!set.contains(x - 1)) {
                int curr = x;
                int streak = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    streak++;
                }
                longest = Math.max(longest, streak);
            }
        }
        return longest;
    }
    static void main() {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
