package PREP2025.Practice.Week15Practice;

import PREP2025.priorityQueue.CombinationSum;

import java.util.ArrayList;
import java.util.List;

public class Feb14Morning {
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

    public static void main(String[] args) {

        CombinationSum s = new CombinationSum();

        int[] candidates = {2,3,6,7};
        int target = 7;

        System.out.println(s.combinationSum(candidates, target));
    }
}
