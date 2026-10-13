package PREP2025.trees;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}
public class InvertBinaryTrees {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(7);

        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);

        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(9);
        TreeNode res = invertTree(treeNode);
        System.out.println("Preorder after inversion:");
        printTree(res);
    }
    static TreeNode invertTree(TreeNode root){
        if (root==null) return null;
        //swap
        TreeNode temp =root.left;
        root.left = root.right;
        root.right = temp;
        //recurse
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    static void printTree(TreeNode root){
        if (root == null) return;
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}

