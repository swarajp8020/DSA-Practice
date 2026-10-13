package PREP2025.trees;

import java.util.HashMap;

class Solution2 {
    int preIndex = 0;
    HashMap<Integer, Integer> inMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder){
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        return build(preorder, 0, inorder.length -1);
    }
    private TreeNode build(int[] preorder, int start, int end){
        if (start>end) return null;
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        int mid = inMap.get(rootVal);
        root.left = build(preorder, start, mid - 1);
        root.right = build(preorder, mid + 1, end);

        return root;
    }
}

public class BuildTreePreIn {
    static void main() {
        Solution2 sol = new Solution2();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = sol.buildTree(preorder,inorder);
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
    }
}
