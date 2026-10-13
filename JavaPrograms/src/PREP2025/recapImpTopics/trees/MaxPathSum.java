package PREP2025.recapImpTopics.trees;

/// explaination - Binary Tree Maximum Path Sum (MaxPathSum)
/// What it asks
/// Find the maximum sum of any path in the tree.
/// Path can start and end anywhere, but must be continuous.
/// This is NOT Path Sum
/// ❌ Not root-to-leaf
/// ❌ Not fixed target
/// ✅ Any node to any node
/// Core trick (VERY IMPORTANT)
/// At each node:
/// You can only return one side upward
/// But you can use both sides to update the answer
/// Recursive contract
/// dfs(node) returns:
/// Maximum path sum starting at this node and going down
/// Global update
/// At each node:
/// left + node + right
/// is a candidate answer
/// Why negative values are clipped
/// If a subtree contributes negative sum, ignore it:
/// Math.max(0, childSum)
/// One-line interview explanation
/// “I use bottom-up DFS. The recursion returns the best downward path, while a global variable tracks the maximum path using both children.”
public class MaxPathSum {
    static class Solution {
        int maxSum = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root){
            dfs(root);
            return maxSum;
        }
        private int dfs(TreeNode node){
            if (node == null) return 0;
            int leftGain = Math.max(0, dfs(node.left));
            int rightGain = Math.max(0, dfs(node.right));
            int currentPath = leftGain + node.value + rightGain;
            maxSum = Math.max(maxSum,currentPath);
            return node.value + Math.max(leftGain, rightGain);
        }
    }
    static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution sol = new Solution();
        System.out.println(sol.maxPathSum(root));
    }
}
