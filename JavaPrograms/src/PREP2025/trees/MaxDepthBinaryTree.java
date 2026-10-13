package PREP2025.trees;

class TreeNode1{
    int val;
    TreeNode1 left, right;
    TreeNode1(int x){val = x;}
}
class MaxDepth{
    public static int maxDepth(TreeNode1 root){
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1+Math.max(left,right);
    }
}

public class MaxDepthBinaryTree {
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(9);
        root.left = new TreeNode1(5);
        root.right = new TreeNode1(4);

        root.right.left = new TreeNode1(8);
        root.right.right = new TreeNode1(6);
        System.out.println(MaxDepth.maxDepth(root));
    }
}

