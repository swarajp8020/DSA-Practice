package PREP2025.Practice.Week7Practice;


class Solution3{
    int maxSum = Integer.MIN_VALUE;
    public int getMaxSum(TreeNode root){
        dfs(root);
        return maxSum;
    }
    public int dfs(TreeNode node){
        if (node == null) return 0;
        int leftGain = Math.max(0, dfs(node.left));
        int rightGain = Math.max(0, dfs(node.right));
        int currentPath = leftGain + node.val + rightGain;
        maxSum = Math.max(maxSum,currentPath);
        return node.val+Math.max(leftGain,rightGain);
    }
}

public class maxPathSum {
    static void main() {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution3 sol = new Solution3();
        System.out.println(sol.getMaxSum(root)); // 42
    }
}
