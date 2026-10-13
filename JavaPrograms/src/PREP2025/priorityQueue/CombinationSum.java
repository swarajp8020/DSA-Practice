package PREP2025.priorityQueue;

import java.util.ArrayList;
import java.util.List;
// Combination Sum (LC 39)
/// ELI5 Explanation
/// Imagine you’re building 7 using blocks:
/// 2, 3, 6, 7
/// At every step you ask:
/// Can I use this number?
/// If yes:
/// Add it
/// Reduce remaining target
/// Continue
/// If remaining target becomes 0 → you found a valid combination.
/// If it becomes negative → stop that path.
/// This is classic backtracking with choice + constraint.
/// Pattern Identification
/// Whenever you see:
/// • “Find all combinations”
/// • “Sum equals target”
/// • “Reuse allowed”
/// Think:
/// 👉 Backtracking with remaining target
/// Core Idea
/// At each step:
/// If target == 0 → add current combination
/// If target < 0 → stop
/// Try each candidate from current index
/// Recurse with reduced target
/// Backtrack (remove last number)
/// Important:
/// We pass same index again because reuse is allowed.

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(candidates, target, 0, path, result);
        return result;
    }
    private void backtrack(int[] candidates, int remaining,
                           int start,
                           List<Integer> path,
                           List<List<Integer>> result) {
        if(remaining == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        if(remaining < 0) return;
        for(int i = start; i < candidates.length; i++) {
            path.add(candidates[i]);
            backtrack(candidates,
                    remaining - candidates[i],
                    i,
                    path,
                    result);
            path.remove(path.size() - 1);
        }
    }
    static void main(String[] args) {
        CombinationSum s = new CombinationSum();
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(s.combinationSum(candidates, target));
    }
}
