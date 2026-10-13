package PREP2025.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 56. Merge Intervals https://leetcode.com/problems/merge-intervals/description/?envType=problem-list-v2&envId=rr2ss0g5
/// ELI5
/// Sort intervals by start time.
/// If the next interval overlaps the previous one, merge them.
/// Otherwise, start a new interval.
/// Pattern
/// Sort by start
/// Keep a current interval
/// Merge if next.start <= current.end
public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        for (int[] it : intervals) {
            if (res.isEmpty() || res.get(res.size() - 1)[1] < it[0]) {
                res.add(it);
            } else {
                res.get(res.size() - 1)[1] =
                        Math.max(res.get(res.size() - 1)[1], it[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
    static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);
        System.out.println(Arrays.deepToString(result));
    }
}
