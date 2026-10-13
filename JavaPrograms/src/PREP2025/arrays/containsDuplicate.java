package PREP2025.arrays;

import java.util.HashSet;
/// LC - 217. Contains Duplicate https://leetcode.com/problems/contains-duplicate/description/?envType=problem-list-v2&envId=rr2ss0g5
/// If you’ve seen a number before → duplicate exists.
public class containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }

    static void main() {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}