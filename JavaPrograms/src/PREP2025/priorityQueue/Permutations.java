package PREP2025.priorityQueue;
// Permutations (LC 46)

import java.util.ArrayList;
import java.util.List;

/// 🧠 ELI5 Explanation
/// Subsets were about:
/// 👉 “Take it or don’t take it.”
/// Permutations are different.
/// Here the question is:
/// 👉 “What order can I arrange everything in?”
/// Imagine 3 seats and 3 people.
/// For seat 1, you can choose any of the 3.
/// For seat 2, you choose from remaining 2.
/// For seat 3, last one goes.
/// That’s factorial growth:
/// Total = 3! = 6
/// 🔎 Pattern Identification
/// Whenever you see:
/// “All arrangements”
/// “All orderings”
/// “Permutations”
/// Think:
/// 👉 Backtracking + Used tracking
/// 🧩 Core Idea
/// Maintain a current path
/// Keep track of which elements are used
/// For each position, try all unused elements
/// Backtrack
// 📊 Complexity Time: O(n × n!), Space: O(n) recursion depth
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, path, used, result);
        return result;
    }
    private void backtrack(int[] nums,
                           List<Integer> path,
                           boolean[] used,
                           List<List<Integer>> result) {
        if(path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(used[i]) continue;
            path.add(nums[i]);
            used[i] = true;
            backtrack(nums, path, used, result);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
    static void main(String[] args) {
        Permutations s = new Permutations();
        int[] nums = {1,2,3};
        System.out.println(s.permute(nums));
    }
}
