package PREP2025.recapImpTopics.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/// explaination - Level Order Traversal
/// What it asks
/// Return nodes level by level.
/// Core idea
/// Classic BFS with queue.
/// Pattern
/// Queue
/// Process size = current level
/// Add children for next level
/// One-line interview explanation
/// “I use BFS with a queue and process nodes level by level using the queue size.”
public class LevelOrderTraversal {
    public List<List<Integer>>levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.value);
                if (node.left != null)q.add(node.left);
                if (node.right!= null)q.add(node.right);
            }
            res.add(level);
        }
        return res;
    }

    static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);

        LevelOrderTraversal sol = new LevelOrderTraversal();
        System.out.println(sol.levelOrder(node));
    }
}
