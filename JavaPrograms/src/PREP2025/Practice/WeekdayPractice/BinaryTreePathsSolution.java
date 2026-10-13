package PREP2025.Practice.WeekdayPractice;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathsSolution {
    public List<String > binaryTreePaths(TreeNode root){
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        dfs(root, String.valueOf(root.val), res);
        return res;
    }
    static void dfs(TreeNode node, String path, List<String> result){
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }
        if (node.left != null) {
            dfs(node.left, path+" -> "+node.left.val, result);
        }
        if (node.right != null){
            dfs(node.right, path +" -> "+node.right.val,result);
        }
    }

    static void main() {
        TreeNode n = new TreeNode(1);
        n.left = new TreeNode(2);
        n.right = new TreeNode(3);
        n.left.left = new TreeNode(4);
        n.left.left = new TreeNode(5);
        n.right.left = new TreeNode(6);
        n.right.right = new TreeNode(7);
        BinaryTreePathsSolution solution = new BinaryTreePathsSolution();
        System.out.println(solution.binaryTreePaths(n));
    }
}
