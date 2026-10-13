package PREP2025.recapImpTopics.trees;
/// Explaination -FIRST: THE MENTAL RESET (IMPORTANT)
/// Forget code for a minute.
/// Every tree problem boils down to answering one question:
/// “What does my recursive function return to its parent?”
/// If you can’t answer that in one sentence, the solution will be shaky.
/// CORE TREE PATTERNS (YOU’LL SEE THESE AGAIN AND AGAIN)
/// Top-down recursion
/// Parent passes info to children
/// Bottom-up recursion (MOST IMPORTANT)
/// Children return info to parent
/// Today we focus on bottom-up, because:
/// Depth
/// Diameter
/// Balanced tree
/// LCA
/// all depend on it.
/// PROBLEM 1 — MAXIMUM DEPTH OF BINARY TREE (FOUNDATION)
/// ELI5
/// “How tall is the tree?”
/// The ONLY correct question to ask
/// At any node:
/// “If I ask my left and right child how tall they are, what should I do with that information?”
/// Answer:
/// Take the max and add 1 (for myself)
/// RECURSIVE CONTRACT (MEMORIZE THIS)
/// dfs(node) returns the height of the subtree rooted at node
/// That’s the entire contract.
class TreeNode{
    int value;
    TreeNode left, right;
    TreeNode(int x){value=x;}
}
public class maxDepth {
    static int maxDepth(TreeNode root){
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left,right);
    }

    static void main() {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.right = new TreeNode(4);
        node.left.right = new TreeNode(2);
        node.left.left = new TreeNode(1);
        System.out.println(maxDepth(node));
    }
}
