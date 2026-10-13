package PREP2025.trees;

class Solution31 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        // if root is p or q, return it
        if (root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // p and q found in different subtrees
        if (left != null && right != null) return root;

        // both in same subtree
        return left != null ? left : right;
    }
}


public class LowestCommonAncestor {
    static void main() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(8);

        Solution31 sol = new Solution31();

        TreeNode p = root.left.left;   // 6
        TreeNode q = root.left.right;  // 2

        TreeNode lca = sol.lowestCommonAncestor(root, p, q);
        System.out.println(lca.val);
    }
}
