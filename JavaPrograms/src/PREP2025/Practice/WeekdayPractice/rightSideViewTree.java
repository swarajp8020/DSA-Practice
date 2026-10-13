package PREP2025.Practice.WeekdayPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution22{
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if (root==null)return result;
        Queue<TreeNode> q =new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            TreeNode last = null;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                last = node;
                if (node.left!= null)q.add(node.left);
                if (node.right!=null)q.add(node.right);
            }
            result.add(last.val);
        }
        return result;
    }
}

public class rightSideViewTree {
    static void main() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(5);
        Solution22 solution = new Solution22();
        System.out.println(solution.rightSideView(node));
    }
}
