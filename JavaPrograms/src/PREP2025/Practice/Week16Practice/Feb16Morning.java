package PREP2025.Practice.Week16Practice;

import PREP2025.priorityQueue.Permutations;

import java.util.ArrayList;
import java.util.List;

public class Feb16Morning {
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
