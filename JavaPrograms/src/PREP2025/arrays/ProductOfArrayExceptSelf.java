package PREP2025.arrays;
// LeetCode 238 — Product of Array Except Self https://leetcode.com/problems/product-of-array-except-self/?envType=problem-list-v2&envId=rr2ss0g5

import java.util.Arrays;

///1️⃣ ELI5 explanation
/// You have an array.
/// For each index i, you want:
/// product of all numbers except nums[i]
/// Example:
/// [1,2,3,4]
/// Answer:
/// for 1 → 2×3×4 = 24
/// for 2 → 1×3×4 = 12
/// for 3 → 1×2×4 = 8
/// for 4 → 1×2×3 = 6
/// So output: [24,12,8,6]
/// 2️⃣ Why we can’t use division
/// Because array can contain 0.
/// Example: [1,2,0,4]
/// Division breaks.
/// So we use a smarter approach.
/// 3️⃣ Pattern
/// Prefix product + Suffix product
/// For each index i:
/// PREP2025.prefix = product of all elements left of i
/// suffix = product of all elements right of i
/// Answer:
/// ans[i] = PREP2025.prefix[i] * suffix[i]
/// But we can do it in O(1) extra space (excluding output).
/// ✅ Best Approach (No extra PREP2025.arrays)
/// Step 1:
/// Create ans[] where:
/// ans[i] = product of elements to the LEFT
/// Step 2:
/// Traverse from right and multiply by rightProduct
/// 4️⃣ Common mistakes
/// ❌ Using division
/// ❌ Forgetting to update right product
/// ❌ Off-by-one in PREP2025.prefix/suffix

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        // PREP2025.prefix products
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }
        // suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }
    static void main() {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
