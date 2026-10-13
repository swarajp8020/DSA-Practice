package PREP2025.Practice.Week15Practice;

import java.util.ArrayList;
import java.util.List;

public class Feb13Morning {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtrack(nums, 0 , subset, result);
        return result;
    }
    private void backtrack(int[] nums, int start,
                           List<Integer> subset,
                           List<List<Integer>> result) {
        result.add(new ArrayList<>(subset));
        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            backtrack(nums, i + 1, subset, result);
            subset.remove(subset.size() - 1);
        }
    }
    static void main(String[] args) {

        Feb13Morning s = new Feb13Morning();
        int[] nums = {1,2,3};
        List<List<Integer>> res = s.subsets(nums);
        System.out.println(res);
    }
}
