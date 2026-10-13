package PREP2025.trees;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        // swap children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // invert subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    static void main() {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(1);

        InvertTree inv = new InvertTree();
        TreeNode res = inv.invertTree(node);

        // simple check
        System.out.println(res.left.val);  // 3
        System.out.println(res.right.val); // 4
    }
}
