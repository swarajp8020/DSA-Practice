package PREP2025.Practice.WeekdayPractice;

import java.util.ArrayList;
import java.util.List;

public class pathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, targetSum, path, res);
        return res;
    }
    static void dfs(TreeNode node, int target, List<Integer>path, List<List<Integer>>res){
        if (node==null)return;
        path.add(node.val);
        if (node.left== null && node.right == null && node.val == target){
            res.add(new ArrayList<>(path));
        }
        dfs(node.left, target - node.val,path,res);
        dfs(node.right, target -node.val,path,res);
        path.remove(path.size()-1);
    }

    static void main() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        pathSum2 p = new pathSum2();
        System.out.println(p.pathSum(root,22));
    }
}
