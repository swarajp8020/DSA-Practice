package PREP2025.trees;

class Solution{
    public boolean isBalanced(TreeNode root){
        return dfs(root)!=-1;
    }
    private int dfs(TreeNode node){
        if (node==null)return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        if (left==-1 ||right==-1)return -1;
        if (Math.abs(left-right)>1)return -1;
        return 1+Math.max(left,right);
    }
}

public class BalancedTree {
    public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    Solution solution = new Solution();
        System.out.println(solution.isBalanced(root));
    }
}
