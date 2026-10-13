package PREP2025.recapImpTopics.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/// explaination - Bottom-Up Level Order Traversal
/// What it asks
/// Return level order from bottom to top.
/// Core idea
/// Normal BFS + reverse at end.
/// Why not complicate it
/// You don’t need fancy recursion.
/// Just collect levels normally, then reverse.
/// One-line interview explanation
/// “I perform standard BFS, collect all levels, and reverse the result.”
public class BottomUpLevelOrder {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.value);
                if (node.left!=null)q.add(node.left);
                if (node.right!=null)q.add(node.right);
            }
            result.add(0,level);
        }
        return result;
    }

    static void main(String[] args) {
         TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(1);

        BottomUpLevelOrder sol = new BottomUpLevelOrder();
        System.out.println(sol.levelOrderBottom(node));
    }
}
