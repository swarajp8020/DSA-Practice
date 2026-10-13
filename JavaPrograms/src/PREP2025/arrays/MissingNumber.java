package PREP2025.arrays;
//LC 268 – Missing Number https://leetcode.com/problems/missing-number/description/
/// ELI5
/// You have numbers from 0 to n.
/// One number is missing.
/// Best pattern (XOR – very interview-friendly)
/// Why XOR works
/// x ^ x = 0
/// x ^ 0 = x
/// Order doesn’t matter
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i <= nums.length; i++) {
            res ^= i;
        }
        for (int x : nums) {
            res ^= x;
        }
        return res;
    }
    static void main() {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums)                                                                          );
    }
}
