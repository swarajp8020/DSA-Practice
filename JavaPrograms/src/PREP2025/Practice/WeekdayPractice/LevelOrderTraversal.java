package PREP2025.Practice.WeekdayPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution12{

}

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if (root==null)return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer>level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);
                if (node.left!=null)q.add(node.left);
                if (node.right!=null)q.add(node.right);
            }
            result.add(level);
        }
        return result;
    }
    public static void main() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        LevelOrderTraversal level = new LevelOrderTraversal();
        System.out.println(level.levelOrder(node));
    }
}
