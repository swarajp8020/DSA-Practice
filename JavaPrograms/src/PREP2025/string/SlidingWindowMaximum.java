package PREP2025.string;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/// 239. Sliding Window Maximum https://leetcode.com/problems/sliding-window-maximum/description/

public class SlidingWindowMaximum {
    static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k  = 3;
        sol so = new sol();
        System.out.println(Arrays.toString(so.slidingWindowMax(nums,k)));
    }
    /// Time & Space (interview answer)
    /// Time: O(n)
    /// Each index enters and leaves deque once.
    /// Space: O(k)
    /// Deque stores at most k elements.
    /// 🧠 One-sentence explanation (practice this)
    /// We use a monotonic deque to keep potential maximums, removing smaller and expired elements so the front always holds the window’s maximum.
    static class sol{
        public int[] slidingWindowMax(int[] nums, int k){
            if (nums.length == 0 || k == 0) return new int[0];

            Deque<Integer> dq = new ArrayDeque<>();
            int[] res = new int[nums.length - k + 1];
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                    dq.pollFirst();
                }
                while (!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                    dq.pollLast();
                }
                dq.offerLast(i);
                if (i >= k - 1) {
                    res[index++]=nums[dq.peekFirst()];
                }
            }
            return res;
        }
    }
}
