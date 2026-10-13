package PREP2025.Practice.WeekdayPractice;

import java.util.ArrayList;
import java.util.List;

public class treeTraversalPreInPost {
    public List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        preOrder(root,result);
        return result;
    }
    private void preOrder(TreeNode node, List<Integer> res){
        if (node==null) return;
        res.add(node.val);
        preOrder(node.left,res);
        preOrder(node.right,res);
    }

    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        inOrder(root,result);
        return result;
    }
    private void inOrder(TreeNode node, List<Integer> res){
        if (node==null) return;
        inOrder(node.left,res);
        res.add(node.val);
        inOrder(node.right,res);
    }

    public List<Integer> postOrderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        postOrder(root,result);
        return result;
    }
    private void postOrder(TreeNode node, List<Integer> res){
        if (node==null) return;
        postOrder(node.left,res);
        postOrder(node.right,res);
        res.add(node.val);
    }

    static void main() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);

        treeTraversalPreInPost t = new treeTraversalPreInPost();
        System.out.println(t.preOrderTraversal(node));   // [1,2,4,5,3]
        System.out.println(t.inOrderTraversal(node));    // [4,2,5,1,3]
        System.out.println(t.postOrderTraversal(node));  // [4,5,2,3,1]
    }
}
