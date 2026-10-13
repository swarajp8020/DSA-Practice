package PREP2025.trees;


public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q){
        if (p== null && q == null) return true; // BOTH NULL → SAME
        if (p == null || q == null) return false; // ONE NULL → DIFFERENT
        if (p.val != q.val) return false; // VALUES DIFFERENT
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public static void main(String[] args) {
    TreeNode a = new TreeNode(5);
    a.left = new TreeNode(4);
    a.right = new TreeNode(3);

    TreeNode b = new TreeNode(5);
    b.left = new TreeNode(4);
    b.right = new TreeNode(3);
        System.out.println(isSameTree(a,b));
    }
}
