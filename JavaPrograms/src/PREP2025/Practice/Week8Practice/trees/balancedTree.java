package PREP2025.Practice.Week8Practice.trees;

/// Explaination - 1️⃣ “What should the recursive function return?”
/// You said:
/// it will return whether nodes is having same child nodes
/// ❌ This is incorrect and dangerous for interviews.
/// Correct answer (LOCK THIS):
/// The recursive function returns the height of the subtree,
/// OR returns -1 if the subtree is already unbalanced.
/// That’s the key idea.
/// We do not return boolean directly.
/// We encode balance inside the height.
/// Why?
/// Because height is still needed by the parent.
/// 2️⃣ “How do we detect imbalance early?”
/// You said:
/// suppose in one node we have 1 child node & another node is having 2 child node…
/// That’s describing a scenario, not a rule.
/// Interviewers want logic, not examples.
/// Correct logic (ELI5):
/// At each node:
/// Ask left child for its height
/// Ask right child for its height
/// If either child already says ‘unbalanced’ → stop
/// If abs(left - right) > 1 → unbalanced
/// Otherwise → return 1 + max(left, right)
/// That’s it.
/// Early detection happens because:
/// the moment any subtree returns -1, we immediately bubble -1 upward
/// no extra work
/// 3️⃣ “Why checking only at root is not enough?”
/// You said:
/// because root is where it all begins so we need to check each node for that depth first search is required right?
/// You’re half-right, but the reasoning is off.
/// Correct explanation (interview-ready):
/// A tree can be unbalanced deep inside even if the root looks balanced.
/// Balance is a local property, so it must be checked at every node.
/// Example:
///       1
///      / \
///     2   3
///    /
///   4
///  /
/// 5
/// Root’s left & right heights differ by 1 → looks fine
/// Node 2 is unbalanced → tree is NOT balanced
/// That’s why DFS + bottom-up is required.
/// INTERVIEW EXPLANATION (THIS IS GOLD)
/// Say this calmly:
/// “I use bottom-up recursion.
/// My helper function returns the height of the subtree, or -1 if it’s unbalanced.
/// At each node, I compare left and right heights.
/// If the difference exceeds 1, I return -1 immediately.
/// Otherwise, I return the height.
/// The tree is balanced if the root does not return -1.”
/// That answer is top-company safe.
public class balancedTree {
    static class Solu{
        public boolean isBalanced(TreeNode root){return dfs(root)!=-1;}
        private int dfs(TreeNode node){
            if (node == null) return 0;
            int left = dfs(node.left);
            int right = dfs(node.right);
            if (left == -1 || right == -1)return -1;
            if (Math.abs(left-right)>1)return -1;
            return 1 + Math.max(left,right);
        }
    }
    static void main() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solu solution = new Solu();
        System.out.println(solution.isBalanced(root));
    }
}
