package PREP2025.recapImpTopics.trees;

/// Explaination - FIRST: WHAT DIAMETER REALLY MEANS (ELI5)
/// Diameter =
/// 👉 the longest path between any two nodes in the tree
/// 👉 path does NOT have to pass through the root
/// Important:
/// Path length is measured in number of edges, not nodes (LeetCode convention)
/// WHY THIS PROBLEM IS TRICKY
/// Because it asks two things at once:
/// For every node, compute height
/// While doing that, update a global best path
/// Most people mess this up because they don’t separate:
/// what recursion returns
/// what recursion updates globally
/// We will separate them cleanly.
/// THE MOST IMPORTANT QUESTION (ANSWER THIS FIRST)
/// What does my recursive function return to its parent?
/// Answer (lock this in):
/// It returns the height of the subtree rooted at this node.
/// Same as maxDepth. No change.
/// CORE IDEA (WRITE THIS MENTALLY)
/// recursion returns → height
/// global variable tracks → diameter
/// If you mix these two, the solution breaks.
public class diameterOfBT {
    static int diameter = 0;
    static int diameterOfBinaryTree(TreeNode root){
        diameter = 0;
        height(root);
        return diameter;
    }
    static int height(TreeNode node){
        if (node == null) return 0;
        int left = height(node.left);
        int right = height(node.right);
        diameter = Math.max(diameter, left+right);
        return 1 + Math.max(left,right);
    }
    static void main() {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.right = new TreeNode(4);
        node.left.right = new TreeNode(2);
        node.left.left = new TreeNode(1);
        System.out.println(diameterOfBinaryTree(node));
    }
}
