package PREP2025.Practice.WeekdayPractice;

public class pathSum {
    public boolean hasPathSum(TreeNode root, int targetSum){
        if (root==null) return false;
        if (root.left == null && root.right == null){
            return root.val == targetSum;
        }
        int newTarget = targetSum -root.val;
        return hasPathSum(root.left, newTarget)||
                hasPathSum(root.right, newTarget);
    }
    static void main() {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(1);
        pathSum p = new pathSum();
        System.out.println(p.hasPathSum(node,4));
    }
}
