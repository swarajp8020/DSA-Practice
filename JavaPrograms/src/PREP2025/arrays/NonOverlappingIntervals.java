package PREP2025.arrays;
// LC 435 – Non-overlapping Intervals https://leetcode.com/problems/non-overlapping-intervals/

import java.util.Arrays;

/// ELI5
/// Remove the minimum number of intervals so the rest don’t overlap.
/// Key idea:
/// Always keep the interval that ends earlier.
/// Pattern
/// Sort by end time
/// Track prevEnd
/// If overlap → remove one (count++)
public class NonOverlappingIntervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int prevEnd = Integer.MIN_VALUE;
        int removals = 0;
        for (int[] it : intervals) {
            if (it[0] >= prevEnd) {
                prevEnd = it[1];
            } else {
                removals++;
            }
        }
        return removals;
    }

    static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
