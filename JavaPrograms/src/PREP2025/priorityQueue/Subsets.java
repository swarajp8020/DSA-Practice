package PREP2025.priorityQueue;
// Subsets
/// ELI5 Explanation
/// Imagine you have 3 switches:
/// 1
/// 2
/// 3
/// For each number, you have two choices:
/// • Take it
/// • Don’t take it
/// That’s it.
/// Each element creates a decision tree.
/// So total subsets = 2^n
/// Pattern Identification
/// Whenever you see:
/// • “all subsets”
/// • “all combinations”
/// • “power set”
/// Think:
/// 👉 Backtracking with include/exclude choice
/// Core Idea
/// At every index:
/// Add current subset to result
/// Try adding each remaining element
/// Recurse
/// Undo choice (backtrack)
import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtrack(nums, 0, subset, result);
        return result;
    }
    private void backtrack(int[] nums, int start,
                           List<Integer> subset,
                           List<List<Integer>> result) {
        result.add(new ArrayList<>(subset));
        for(int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            backtrack(nums, i + 1, subset, result);
            subset.remove(subset.size() - 1);
        }
    }
    public static void main(String[] args) {

        Subsets s = new Subsets();
        int[] nums = {1,2,3};
        List<List<Integer>> res = s.subsets(nums);
        System.out.println(res);
    }
}
