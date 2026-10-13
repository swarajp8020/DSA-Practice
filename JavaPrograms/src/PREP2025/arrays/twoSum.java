package PREP2025.arrays;

import java.util.Arrays;
import java.util.HashMap;
/// You have numbers and a target.
/// You want two numbers that add up to target.
/// Instead of checking every pair (slow), we remember what we’ve seen.
/// Example:
/// nums = [2,7,11,15], target=9
/// When we see 7, we ask:
/// “Do I already have 2?” ✅ Yes → answer found.
/// Time Complexity: $O(N)$ (One pass).Space Complexity: $O(N)$ (PREP2025.HashMap storage).
public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
    // Map to store value -> index
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        // If we found the "other half" of the pair in our history
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        // Otherwise, add current number to history
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No solution found");
//        return new int[]{-1, -1};
}
    static void main() {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
