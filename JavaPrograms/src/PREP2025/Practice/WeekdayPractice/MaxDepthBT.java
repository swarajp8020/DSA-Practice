package PREP2025.Practice.WeekdayPractice;
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int x){val =x;}
}
class MaxDepth{
    public static int maxDepth(TreeNode root){
        if (root == null)return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1+Math.max(left, right);
    }
}
public class MaxDepthBT {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        System.out.println(MaxDepth.maxDepth(node));
    }
}
