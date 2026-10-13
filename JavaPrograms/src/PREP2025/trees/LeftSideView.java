package PREP2025.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
///  Left Side View is literally: Right Side View — one line changed.
class Solution3{
    public List<Integer> leftSideView(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                // Line changed
                if (i == 0){
                    res.add(node.val);
                }
                if (node.left!= null)q.add(node.left);
                if (node.right!=null)q.add(node.right);
            }
        }
        return res;
    }
}
public class LeftSideView {
    static void main() {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(1);

        Solution3 sol = new Solution3();
        System.out.println(sol.leftSideView(node));
    }
}
