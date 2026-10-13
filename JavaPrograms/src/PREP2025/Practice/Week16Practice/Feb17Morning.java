package PREP2025.Practice.Week16Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Feb17Morning {
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
        Feb17Morning s = new Feb17Morning();
        int[] nums = {1,1,2};
        System.out.println(s.permuteUnique(nums));
    }
}
