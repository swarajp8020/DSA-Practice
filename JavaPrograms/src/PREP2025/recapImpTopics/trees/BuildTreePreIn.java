package PREP2025.recapImpTopics.trees;

import java.util.HashMap;
/// explaination - Build Tree from Preorder & Inorder (IMPORTANT)
/// Yes — this is a LeetCode problem
/// 👉 LeetCode 105: Construct Binary Tree from Preorder and Inorder Traversal
/// This is a very high-value interview problem.
/// Given
/// Preorder: Root → Left → Right
/// Inorder: Left → Root → Right
/// Key observation (THIS IS THE UNLOCK)
/// First element of preorder is root
/// Root splits inorder into:
/// left subtree
/// right subtree
/// Recursive strategy
/// Take root from preorder
/// Find root index in inorder
/// Left subtree size = index difference
/// Recursively build left and right subtrees
/// Why a hashmap is needed
/// To find root index in inorder in O(1) time.
/// Interview explanation
/// “Preorder gives me the root.
/// Inorder tells me how the tree is split into left and right subtrees.
/// I recursively build both sides using index ranges and a hashmap for fast lookup.”
public class BuildTreePreIn {
    static class Solution{
        int preIndex = 0;
        HashMap<Integer, Integer> inMap = new HashMap<>();
        public TreeNode buildTree(int[] preorder, int[] inorder){
            for (int i = 0; i < inorder.length; i++) {
                inMap.put(inorder[i], i);
            }
            return build(preorder, 0, inorder.length-1);
        }
        private TreeNode build(int[] preorder, int start, int end){
            if (start>end) return null;
            int rootVal = preorder[preIndex++];
            TreeNode root = new TreeNode(rootVal);
            int mid = inMap.get(rootVal);
            root.left = build(preorder, start, mid-1);
            root.right = build(preorder, mid+1, end);
            return root;
        }
    }

    static void main(String[] args) {
        Solution sol = new Solution();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = sol.buildTree(preorder,inorder);
        System.out.println(root.value);
        System.out.println(root.left.value);
        System.out.println(root.right.value);
    }
}
