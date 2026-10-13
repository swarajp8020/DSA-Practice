package PREP2025.Practice.Week8Practice.trees;

import java.util.HashMap;
/// LC - https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/submissions/1863855049/
/// explaination - Build Tree from Inorder + Postorder
/// LeetCode reference
/// 👉 LeetCode 106 — Construct Binary Tree from Inorder and Postorder Traversal
/// Given
/// Inorder: Left → Root → Right
/// Postorder: Left → Right → Root
/// Core observation
/// Last element of postorder = root
/// Root splits inorder into left/right subtrees
/// Recursive strategy
/// Pick root from postorder
/// Find root index in inorder (use hashmap)
/// Build right subtree first
/// Then build left subtree
/// ⚠️ Order matters because postorder consumes root from the end.
/// One-line interview explanation
/// “Postorder gives the root from the end, inorder splits left and right subtrees, and I recursively construct both using index ranges.”
public class BuildTreeInPost {
    int postIndex;
    HashMap<Integer, Integer> inMap = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder){
        postIndex = postorder.length-1;
        inMap.clear();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        return build(inorder, postorder, 0, inorder.length-1);
    }
    private TreeNode build(int[] inorder, int[] postorder, int start, int end){
        if (start>end) return null;
        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);
        int mid = inMap.get(rootVal);
        root.right = build(inorder, postorder, mid+1, end);
        root.left = build(inorder, postorder, start, mid-1);
        return root;
    }
    static void main(String[] args) {
        BuildTreeInPost sol = new BuildTreeInPost();

        int[] inorder   = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};

        TreeNode root = sol.buildTree(inorder, postorder);

        System.out.println(root.value);        // 3
        System.out.println(root.left.value);   // 9
        System.out.println(root.right.value);  // 20
    }
}
