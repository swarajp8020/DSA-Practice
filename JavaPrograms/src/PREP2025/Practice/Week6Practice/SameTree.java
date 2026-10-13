package PREP2025.Practice.Week6Practice;

public class SameTree {
    public static boolean isSame(TreeNode p, TreeNode q){
        if (p == null && q == null) return true;
        if (p == null || q== null) return false;
        if (p.value!=q.value) return false;
        return isSame(p.left,q.left)&&isSame(p.right,q.right);
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);
        a.left = new TreeNode(4);
        a.right = new TreeNode(3);

        TreeNode b = new TreeNode(5);
        b.left = new TreeNode(4);
        b.right = new TreeNode(3);
        System.out.println(isSame(a,b));
    }
}
