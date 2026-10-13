package PREP2025.Practice.Week7Practice;


import java.util.HashMap;

class Solution{
    int postIndex;
    HashMap<Integer, Integer> inMap = new HashMap<>();

    public TreeNode1 buildTree(int[] inorder, int[] postorder){
        postIndex = postorder.length-1;
        inMap.clear();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i],i);
        }
        return build(inorder, postorder, 0, postorder.length-1);
    }
    private TreeNode1 build(int[] inorder, int[] postorder, int start, int end){
        if (start>end)return null;
        int rootVal = postorder[postIndex--];
        TreeNode1 root = new TreeNode1(rootVal);
        int mid = inMap.get(rootVal);
        root.right = build(inorder, postorder, mid+1,end);
        root.left = build(inorder, postorder, start, mid-1);
        return root;
    }
}

public class builtTreeInPost {
    static void main() {
        Solution sol = new Solution();

        int[] inorder   = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};

        TreeNode1 root = sol.buildTree(inorder, postorder);

        System.out.println(root.value);        // 3
        System.out.println(root.left.value);   // 9
        System.out.println(root.right.value);  // 20
    }
}
