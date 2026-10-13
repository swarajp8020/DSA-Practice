package PREP2025.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathsSolution {
    public List<String> binaryTreePath(TreeNode root){
        List<String> result = new ArrayList<>();
        if (root==null) return result;

        dfs(root, String.valueOf(root.val), result);
        return result;
    }
    private void dfs(TreeNode node, String path, List<String> result){
        // LEAF → record the path
        if (node.left == null && node.right == null){
            result.add(path);
            return;
        }
        // go left
        if (node.left != null) {
            dfs(node.left,path+"->"+node.left.val,result);
        }
        // go right
        if (node.right != null) {
            dfs(node.right, path + "->" + node.right.val, result);
        }
    }

    static void main() {
        TreeNode n = new TreeNode(1);
        n.left = new TreeNode(2);
        n.right = new TreeNode(3);
        n.left.left = new TreeNode(4);
        n.left.right = new TreeNode(5);
        BinaryTreePathsSolution solution = new BinaryTreePathsSolution();
        System.out.println(solution.binaryTreePath(n));
    }
}
