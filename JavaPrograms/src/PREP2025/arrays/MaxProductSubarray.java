package PREP2025.arrays;
// LC 152 – Maximum Product Subarray https://leetcode.com/problems/maximum-product-subarray/description/?envType=problem-list-v2&envId=rr2ss0g5
/// ELI5
/// Because of negatives:
/// a small negative × negative = big positive
/// So at every index, you must track:
/// max product ending here
/// min product ending here
/// Pattern
/// DP with two rolling values:
/// maxProd, minProd
public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            if (x < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(x, maxProd * x);
            minProd = Math.min(x, minProd * x);

            ans = Math.max(ans, maxProd);
        }
        return ans;
    }

    static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxProduct(nums));
    }
}
