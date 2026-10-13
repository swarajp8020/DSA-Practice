package PREP2025.Practice.Week8Practice.trees;
/// explaination - Same Tree
/// What the problem asks
/// Check if two PREP2025.trees are structurally identical and have the same values.
/// Base cases (must remember)
/// Both nodes null → true
/// One null, one not → false
/// Values differ → false
/// Recursive rule
/// Trees are same if:
/// current values match
/// left subtrees are same
/// right subtrees are same
/// Interview explanation
/// “I compare both PREP2025.trees recursively.
/// If both nodes are null, I return true.
/// If one is null or values differ, false.
/// Otherwise, I check left and right subtrees.”
public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.value != q.value) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    static void main(String[] args) {
    TreeNode a = new TreeNode(5);
    a.left = new TreeNode(4);
    a.right = new TreeNode(3);

    TreeNode b = new TreeNode(5);
    b.left = new TreeNode(4);
    b.right = new TreeNode(3);
    SameTree ss = new SameTree();
        System.out.println(ss.isSameTree(a,b));
    }
}
