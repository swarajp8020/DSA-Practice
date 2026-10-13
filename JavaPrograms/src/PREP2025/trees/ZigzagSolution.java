package PREP2025.trees;

import java.util.*;

public class ZigzagSolution {
    static void main() {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode( 4);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(1);
        ZigzagSolution zigzagSolution = new ZigzagSolution();
        System.out.println(zigzagSolution.zigZag(node));
    }
    public List<List<Integer>> zigZag(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean reverse = false;

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);
                if (node.left!=null)q.add(node.left);
                if (node.right!= null)q.add(node.right);
            }
            if (reverse) {
                Collections.reverse(level);
            }
            result.add(level);
            reverse = !reverse;
        }
        return result;
    }
    /// without collections.reverse
//    boolean reverse = false; // false = left→right, true = right→left
//
//        while (!q.isEmpty()) {
//        int size = q.size();
//        List<Integer> level = new ArrayList<>();
//
//        for (int i = 0; i < size; i++) {
//            TreeNode node = q.poll();
//
//            // NORMAL BFS storing
//            if (!reverse) {
//                level.add(node.val);
//            } else {
//                // MANUAL reverse insertion
//                level.add(0, node.val);
//            }
//
//            if (node.left != null) q.add(node.left);
//            if (node.right != null) q.add(node.right);
//        }
//
//        result.add(level);
//        reverse = !reverse; // flip direction


}
