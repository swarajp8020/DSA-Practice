package PREP2025.arrays;
//55. Jump Game https://leetcode.com/problems/jump-game/description/?envType=problem-list-v2&envId=rr2ss0g5
/// ELI5
/// You start at index 0.
/// Each number tells how far you can jump.
/// Question: Can you reach the last index?
/// Core Idea
/// Track the farthest index you can reach so far.
/// If at any point your current index is beyond that reach → impossible.
/// Interview line
/// “I greedily track the maximum reachable index. If I ever reach a point beyond it, the end is unreachable.”
public class JumpGame {
    public static boolean canJump(int[] nums) {
        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) return false;

            farthest = Math.max(farthest, i + nums[i]);
        }

        return true;
    }

    static void main() {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
