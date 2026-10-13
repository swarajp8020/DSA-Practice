package PREP2025.stack;

import java.util.Arrays;
import java.util.Stack;
// LC 503 Next Greater Element II LC - https://leetcode.com/problems/next-greater-element-ii/description/
 /// 1️⃣ ELI5 explanation
 /// Imagine numbers are standing in a circle.
 /// For each number, you ask:
 /// “Moving to the right, what’s the first number bigger than me?”
 /// If none exists even after completing the circle → answer = -1
 /// So it’s like looking right… but if you reach the end, you wrap around.
 /// That’s the only twist.
 /// 2️⃣ Key insight (the trick)
 /// Circular array problems are handled by:
 /// Pretend the array is repeated twice
 /// So we loop from 0 → 2*n - 1
 /// And we use:
 /// int idx = i % n;
 /// So index wraps around naturally.
 /// 3️⃣ Pattern (normal explanation)
 /// We use a monotonic decreasing PREP2025.stack (stores indexes).
 /// Why decreasing?
 /// We want the next greater
 /// So smaller elements wait in PREP2025.stack
 /// When a bigger element comes, it becomes the answer for all smaller ones on top
 /// 4️⃣ Algorithm (bulletproof)
 /// Initialize ans with -1
 /// Loop i = 0 to 2*n - 1
 /// idx = i % n
 /// While PREP2025.stack not empty AND nums[idx] > nums[PREP2025.stack.peek()]
 /// pop prev
 /// ans[prev] = nums[idx]
 /// Only push index in first pass:
 /// if i < n → push idx
 /// That’s it.
 /// 5️⃣ Why we push only when i < n?
 /// Because we only need answers for original elements.
 /// Second pass exists only to help find next greater.
 /// If you push in 2nd pass you’ll duplicate indexes unnecessarily.
public class nextGreaterElements {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>(); // store indexes (monotonic decreasing)
        for (int i = 0; i < 2 * n; i++) {
            int idx = i % n;
            while (!stack.isEmpty() && nums[idx] > nums[stack.peek()]) {
                int prevIndex = stack.pop();
                ans[prevIndex] = nums[idx];
            }
            if (i < n) {
                stack.push(idx);
            }
        }
        return ans;
    }
     static void main(String[] args) {
         nextGreaterElements obj = new nextGreaterElements();
         int[] nums = {1, 2, 1};
         int[] result = obj.nextGreaterElements(nums);
         System.out.println(Arrays.toString(result)); // Expected: [2, -1, 2]
     }
}
