package PREP2025.trees;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(root, targetSum, path, result);
        return result;
    }

    private void dfs(TreeNode node, int target, List<Integer> path, List<List<Integer>> result) {
        if (node == null) return;

        // 1. Choose
        path.add(node.val);

        // 2. Leaf check
        if (node.left == null && node.right == null && node.val == target) {
            result.add(new ArrayList<>(path));  // copy path
        }

        // 3. Explore children
        dfs(node.left, target - node.val, path, result);
        dfs(node.right, target - node.val, path, result);

        // 4. Undo (Backtrack)
        path.remove(path.size() - 1);
    }

    static void main() {
        /*
                5
               / \
              4   8
             /   / \
            11  13  4
           /  \     \
          7    2     1
         target = 22

         Answer:
         [[5,4,11,2], [5,8,4,5?] etc...]
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        PathSum2 sol = new PathSum2();
        System.out.println(sol.pathSum(root, 22));
    }
}
