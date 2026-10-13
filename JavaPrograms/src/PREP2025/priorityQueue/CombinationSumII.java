package PREP2025.priorityQueue;
// Combination Sum II (LC 40)
/// ELI5 Explanation
/// Yesterday you had unlimited coins.
/// Today you have a bag of coins.
/// Each coin can be used only once.
/// Also, some coins look identical.
/// If you are not careful, you will produce duplicate answers.
/// So we must:
/// Sort the array first
/// Skip duplicates carefully
/// Pattern Identification
/// Whenever you see:
/// • “Use each element once”
/// • “Avoid duplicate combinations”
/// • “Input contains duplicates”
/// Think:
/// 👉 Backtracking + Sorting + Skip duplicates
/// Core Idea
/// Sort candidates
/// At each level:
/// If current element is same as previous and previous wasn’t used → skip
/// Pass i + 1 because reuse NOT allowed
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
            // Skip duplicates
            if(i > start && candidates[i] == candidates[i - 1])
                continue;
            path.add(candidates[i]);
            backtrack(candidates,
                    remaining - candidates[i],
                    i + 1,
                    path,
                    result);
            path.remove(path.size() - 1);
        }
    }
    static void main(String[] args) {
        CombinationSumII s = new CombinationSumII();
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(s.combinationSum2(candidates, target));
    }
}
