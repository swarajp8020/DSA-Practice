package PREP2025.priorityQueue;
// Permutations II (LC 47)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/// 🧠 ELI5 Explanation
/// Yesterday:
/// Every element was unique.
/// Today:
/// Some numbers are identical.
/// If you blindly permute, you’ll generate duplicates like:
/// 1(from index0), 1(from index1), 2
/// 1(from index1), 1(from index0), 2
/// Those are the same permutation.
/// So we need a rule to prevent duplicate branches.
/// 🔎 Pattern Identification
/// Whenever you see:
/// Permutations
/// Input contains duplicates
/// Unique result required
/// Think:
/// 👉 Sort + Used array + Skip duplicates carefully
/// 💡 Core Idea
/// Sort the array first
/// Use boolean used[]
/// Skip duplicates using this rule:
/// if i > 0 and nums[i] == nums[i-1] and not used[i-1]:
///     continue
/// That line prevents generating the same branch twice.
// 🎯 Interview Explanation (4 lines)
//I sort the array to group duplicates.
//During backtracking, I use a boolean array to track used elements.
//I skip elements if they are duplicates and the previous duplicate was not used.
//This prevents generating identical permutation branches.
///📊 Complexity Worst case: O(n × n!) Space: O(n) recursion PREP2025.stack
public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
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
            // Skip duplicates
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1])
                continue;
            path.add(nums[i]);
            used[i] = true;
            backtrack(nums, path, used, result);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
    static void main(String[] args) {
        PermutationsII s = new PermutationsII();
        int[] nums = {1,1,2};
        System.out.println(s.permuteUnique(nums));
    }
}
