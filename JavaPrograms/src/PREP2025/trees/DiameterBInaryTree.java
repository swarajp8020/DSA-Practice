package PREP2025.trees;
class TreeNode4{
    int val;
    TreeNode4 left,right;
    TreeNode4(int x){val=x;}
}
public class DiameterBInaryTree {
    public static int diameterOfBinaryTree(TreeNode4 node){
        diameter =0;
        height(node);
            return diameter;
    }
    static int diameter = 0;

    private static int height(TreeNode4 root){
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left+right);

        return 1 + Math.max(left,right);
    }

    public static void main(String[] args) {
        TreeNode4 node = new TreeNode4(1);
        node.left = new TreeNode4(2);
        node.right = new TreeNode4(3);
        node.left.left = new TreeNode4(4);
        node.left.right = new TreeNode4(5);
        System.out.println(diameterOfBinaryTree(node));
    }
}
