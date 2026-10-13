package PREP2025.Practice.Week8Practice.trees;
/// explaination -🌳 LOWEST COMMON ANCESTOR (LCA) — RESET THINKING
/// Problem (ELI5)
/// Given a binary tree and two nodes p and q, find the lowest node that has both p and q in its subtree.
/// “Lowest” = deepest in the tree.
/// THE ONE QUESTION THAT MATTERS
/// Before code, answer this:
/// What does my recursive function return to its parent?
/// For LCA, the answer is very different from depth/diameter.
/// ✅ Correct answer (LOCK THIS):
/// The recursive function returns one of three things:
/// null → neither p nor q found in this subtree
/// p or q → one of them found
/// the LCA node → if this subtree contains both
/// This is the entire trick.
/// HOW LCA EMERGES (NO MAGIC)
/// At each node:
/// Ask left subtree: “Did you find p or q?”
/// Ask right subtree: “Did you find p or q?”
/// Now cases:
/// Left	Right	Current node
/// null	null	return null
/// p/q	null	return p/q
/// null	p/q	return p/q
/// p/q	p/q	THIS NODE IS LCA
/// That’s it.
/// No height.
/// No global variable.
/// No backtracking PREP2025.arrays.
/// INTERVIEW EXPLANATION (PRACTICE THIS)
/// “I use bottom-up recursion.
/// My function returns a node if it finds p or q in the subtree.
/// If both left and right subtrees return non-null, the current node is the LCA.
/// Otherwise, I propagate the non-null result upward.”
public class LCA {
    static class Solution{
       public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
           if (root == null) return null;
           if (p == root || q == root) return root;
           TreeNode left = lowestCommonAncestor(root.left, p, q);
           TreeNode right = lowestCommonAncestor(root.right, p, q);
           if (left != null && right != null) return root;
           return left != null ? left : right;
       }
    }
    static void main() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(8);

        Solution sol = new Solution();

        TreeNode p = root.left.left;   // 6
        TreeNode q = root.left.right;  // 2

        TreeNode lca = sol.lowestCommonAncestor(root, p, q);
        System.out.println(lca.value);
    }
}
