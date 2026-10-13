package PREP2025.Practice.Week6Practice;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if (root==null) return false;
        if (isSame(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right,subRoot);
    }
    public static boolean isSame(TreeNode p, TreeNode q){
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.value != q.value) return false;
        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);
        a.left = new TreeNode(4);
        a.right = new TreeNode(3);
        a.left.left = new TreeNode(2);
        a.left.right = new TreeNode(1);
        TreeNode b = new TreeNode(3);
        b.left = new TreeNode(4);

        SubtreeOfAnotherTree subtree = new SubtreeOfAnotherTree();
        System.out.println(subtree.isSubtree(a,b));
    }

}
