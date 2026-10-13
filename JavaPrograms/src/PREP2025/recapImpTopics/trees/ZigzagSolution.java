package PREP2025.recapImpTopics.trees;

import java.util.*;
/// explaination - Zigzag Level Order Traversal
/// What it asks
/// Level order traversal, but:
/// left → right on one level
/// right → left on next
/// Core idea
/// BFS + direction toggle.
/// Two clean ways
/// Reverse list on alternate levels
/// Insert at front/back based on direction (Deque)
/// Mental model
/// Same level order.
/// Only the reading direction changes.
/// One-line interview explanation
/// “I perform level order traversal and reverse the order on alternate levels.”
public class ZigzagSolution {
    public List<List<Integer>> zigZag(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean reverse = false;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.value);
                if (node.left!=null)q.add(node.left);
                if (node.right!=null)q.add(node.right);
            }
            if (reverse) {
                Collections.reverse(level);
            }
            res.add(level);
            reverse = !reverse;
        }
        return res;
    }
    static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode( 4);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(1);
        ZigzagSolution zigzagSolution = new ZigzagSolution();
        System.out.println(zigzagSolution.zigZag(node));
    }
}
