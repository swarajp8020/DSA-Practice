package PREP2025.Practice.WeekdayPractice;

public class invertTree {
    public TreeNode InvertTree(TreeNode root){
        if (root==null)return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        InvertTree(root.left);
        InvertTree(root.right);
        return root;
    }

    static void main() {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(1);
        invertTree tree = new invertTree();
        TreeNode res = tree.InvertTree(node);
        System.out.println(res.left.val);
        System.out.println(res.right.val);
    }
}
