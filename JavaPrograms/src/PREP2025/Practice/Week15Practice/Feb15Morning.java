package PREP2025.Practice.Week15Practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Feb15Morning {
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
        Feb15Morning s = new Feb15Morning();
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(s.combinationSum2(candidates, target));
    }
}
