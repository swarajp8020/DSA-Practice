package PREP2025.Practice.Week6Practice;
class TreeNode1{
    int value;
    TreeNode1 left,right;
    TreeNode1(int x){value = x;}
}
class Solution{
    public static boolean isBalanced(TreeNode1 root){
        return dfs(root)!= -1;
    }
    private static  int dfs(TreeNode1 node){
        if (node == null)return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        if (left == -1 || right == -1) return -1;
        if (Math.abs(left-right)>1) return -1;
        return 1+Math.max(left,right);
    }
}

public class BalancedTree {
    public static void main(String[] args) {
        TreeNode1 node = new TreeNode1(9);
        node.left = new TreeNode1(9);
        node.right = new TreeNode1(20);
        node.right.left = new TreeNode1(15);
        node.right.right = new TreeNode1(7);
        Solution solution = new Solution();
        System.out.println(solution.isBalanced(node));
    }

}
