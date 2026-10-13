package PREP2025.arrays;

public class HouseRobber2 {
    public static int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        return Math.max(
                robLinear(nums, 1, nums.length - 1),
                robLinear(nums, 0, nums.length - 2)
        );
    }

    private static int robLinear(int[] nums, int start, int end) {
        int prev2 = 0, prev1 = 0;

        for (int i = start; i <= end; i++) {
            int curr = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    static void main() {
        int[] nums = {2, 3, 2};
        System.out.println(rob(nums));
    }
}
