package PREP2025.trees;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversalPreInPost {
    /// preOrderTraversal
    public List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        preOrder(root,res);
        return res;
    }
    private void preOrder(TreeNode node, List<Integer> res){
        if (node==null)return;
        res.add(node.val);
        preOrder(node.left,res);
        preOrder(node.right,res);
    }
    /// inOrderTraversal
    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        inOrder(root,res);
        return res;
    }
    private void inOrder(TreeNode node, List<Integer> res){
        if (node==null)return;
        inOrder(node.left,res);
        res.add(node.val);
        inOrder(node.right,res);
    }
    /// postOrderTraversal
    public List<Integer> postOrderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        postOrder(root,res);
        return res;
    }
    private void postOrder(TreeNode node, List<Integer> res){
        if (node==null)return;
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

        TreeTraversalPreInPost t = new TreeTraversalPreInPost();
        System.out.println(t.preOrderTraversal(node));   // [1,2,4,5,3]
        System.out.println(t.inOrderTraversal(node));    // [4,2,5,1,3]
        System.out.println(t.postOrderTraversal(node));  // [4,5,2,3,1]
    }
}
