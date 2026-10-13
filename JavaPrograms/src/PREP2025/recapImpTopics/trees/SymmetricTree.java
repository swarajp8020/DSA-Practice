package PREP2025.recapImpTopics.trees;

/// explaination - Symmetric Tree
/// What it asks
/// Check if tree is a mirror of itself.
/// Core idea
/// Compare:
/// left subtree of left
/// right subtree of right
/// …but crossed
/// Recursive rule
/// Two PREP2025.trees are mirror if:
/// values equal
/// left.left == right.right
/// left.right == right.left
/// One-line interview explanation
/// “I recursively compare left and right subtrees in mirrored order.”
public class SymmetricTree {
    public boolean isSymmetry(TreeNode root){
        if (root == null) return false;
        return isMirror(root.left, root.right);
    }
    private boolean isMirror(TreeNode p, TreeNode q){
        if (p==null && q==null) return true;
        if (p==null || q==null) return false;
        if (p.value!=q.value) return false;
        return isMirror(p.left,q.right)&&isMirror(p.right,q.left);
    }
    static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(3);
        SymmetricTree symmetricTree = new SymmetricTree();
        System.out.println(symmetricTree.isSymmetry(node));
    }
}
