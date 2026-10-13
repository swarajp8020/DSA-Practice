package PREP2025.Practice.Week8Practice.trees;
/// explaination - Subtree of Another Tree
/// What it asks
/// Check if tree t exists inside tree s.
/// Two-step logic
/// Traverse s
/// At each node, check if subtree matches t
/// Helper function
/// isSameTree(a, b) does the deep comparison.
/// Key insight
/// This is tree traversal + Same Tree combined.
/// One-line interview explanation
/// “I traverse the main tree and at each node check if the subtree matches using a Same Tree comparison.”
public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if (root == null) return false;
        if (isSame(root,subRoot))return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    private boolean isSame(TreeNode p, TreeNode q){
        if (p==null && q==null) return true;
        if (p==null || q==null) return false;
        if (p.value!=q.value) return false;
        return isSame(p.left,q.left)&&isSame(p.right,q.right);
    }
    static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        a.left = new TreeNode(4);
        a.right = new TreeNode(5);
        a.left.left = new TreeNode(1);
        a.left.right = new TreeNode(2);

        // Build small tree b
        TreeNode b = new TreeNode(4);
        b.left = new TreeNode(1);
        b.right = new TreeNode(2);

        SubtreeOfAnotherTree subtree = new SubtreeOfAnotherTree();
        System.out.println(subtree.isSubtree(a,b));
    }
}
