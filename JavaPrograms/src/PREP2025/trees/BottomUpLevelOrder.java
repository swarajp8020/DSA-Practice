package PREP2025.trees;

import java.util.*;
/// Bottom-Up is literally LevelOrderTraversal with one line changed: result.add(0, level);
public class BottomUpLevelOrder {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>(); // important
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            // add level at the FRONT
            result.add(0, level);
        }

        return result;
    }

    static void main() {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(1);

        BottomUpLevelOrder sol = new BottomUpLevelOrder();
        System.out.println(sol.levelOrderBottom(node));
    }
}
