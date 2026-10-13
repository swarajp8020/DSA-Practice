package PREP2025.trees;

public class SymmetricTree {
    public  boolean isSymmetry(TreeNode root){
        if (root == null) return false;
        return isMirror(root.left,root.right);
    }
    private boolean isMirror(TreeNode a, TreeNode b){
        if (a==null && b==null)return true;
        if (a==null || b==null) return false;
        if (a.val!=b.val)return false;
        return isMirror(a.left,b.right)&& isMirror(a.right,b.left);
    }

    static void main() {
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
