package PREP2025.recapImpTopics.trees;

/// explaination - Invert Binary Tree
/// What the problem asks
/// Mirror the tree by swapping left and right children at every node.
/// Core idea
/// At each node:
/// swap left and right
/// recurse on children
/// Why recursion is natural here
/// Each subtree is inverted independently.
/// Interview explanation
/// “At each node, I swap left and right children and recursively invert both subtrees.”
public class InvertTree {
    public TreeNode invertTree(TreeNode root){
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(1);

        InvertTree inv = new InvertTree();
        TreeNode res = inv.invertTree(node);

        System.out.println(res.left.value);
        System.out.println(res.right.value);
    }
}
