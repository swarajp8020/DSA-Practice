package PREP2025.Practice.Week8Practice.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leftSideView {
    public List<Integer> leftSideView(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if (root==null) return null;
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (i == 0) {
                    res.add(node.value);
                }
                if (node.left!=null)q.add(node.left);
                if (node.right!=null)q.add(node.right);
            }
        }
        return res;
    }

    static void main() {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(1);
        leftSideView sol = new leftSideView();
        System.out.println(sol.leftSideView(node));
    }
}
