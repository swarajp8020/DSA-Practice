package PREP2025.recapImpTopics.trees;

/// Explaination - PATH SUM — BIG PICTURE FIRST
/// What kind of paths are we talking about?
/// Path must go top → down
/// It does not have to end at a leaf (Path Sum I does end at leaf)
/// You cannot go up or sideways
/// So this is pure DFS with state carried along the path.
/// PATH SUM I (ELI5)
/// Problem
/// Is there any root-to-leaf path where the sum of node values equals targetSum?
/// You don’t need the path.
/// You just need true / false.
/// THE ONLY QUESTION YOU SHOULD ASK
/// “What state do I need to carry while going down the tree?”
/// Answer:
/// The remaining sum.
/// MENTAL MODEL (LOCK THIS)
/// At each node:
/// Subtract node value from targetSum
/// Pass the remaining sum to children
/// At a leaf:
/// if remaining sum == 0 → success
/// INTERVIEW EXPLANATION (PRACTICE THIS)
/// For Path Sum I:
/// “I pass the remaining sum downward.
/// At each leaf, I check if the remaining sum equals the node value.”
public class pathSum {
    public boolean hasPathSum(TreeNode root, int targetSum){
        if (root == null) return false;
        if (root.left == null && root.right == null) return root.value == targetSum;
        int newTargetSum = targetSum - root.value;
        return hasPathSum(root.left, newTargetSum) || hasPathSum(root.right, newTargetSum);
    }

    static void main() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        pathSum ps = new pathSum();
        System.out.println(ps.hasPathSum(root,4));
    }
}
