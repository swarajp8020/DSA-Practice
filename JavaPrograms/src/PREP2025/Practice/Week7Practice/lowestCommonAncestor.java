package PREP2025.Practice.Week7Practice;


class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int x){val =x;}
}

class Solution1{
    public TreeNode LCM(TreeNode root, TreeNode p, TreeNode q){
        if (root == null) return null;
        if (root == p || root == q) return root;
        TreeNode left = LCM(root.left, p , q);
        TreeNode right = LCM(root.right, p ,q);
        if (left!= null && right!=null)return root;
        return left!=null ? left:right;
    }
}

public class lowestCommonAncestor {
    static void main() {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(5);
        node.right = new TreeNode(1);
        node.left.right = new TreeNode(6);
        node.left.left = new TreeNode(2);
        node.right.right = new TreeNode(8);
        Solution1 sol = new Solution1();
        TreeNode p = node.left.left;
        TreeNode q = node.left.right;
        TreeNode lca = sol.LCM(node,p,q);
        System.out.println(lca.val);
    }
}
