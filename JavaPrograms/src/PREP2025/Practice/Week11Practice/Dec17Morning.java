package PREP2025.Practice.Week11Practice;

import java.util.HashSet;

public class Dec17Morning {
    public static int longestConsecutive(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int x:nums) set.add(x);
        int longest = 0;
        for (int x:set){
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
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
}
