package PREP2025.trees;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return root.val == targetSum;
        }
        int newTargetSum = targetSum - root.val;
        return hasPathSum(root.left, newTargetSum) ||
                hasPathSum(root.right, newTargetSum);
    }

    static void main() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        PathSum ps = new PathSum();
        System.out.println(ps.hasPathSum(root,4));

    }
}
