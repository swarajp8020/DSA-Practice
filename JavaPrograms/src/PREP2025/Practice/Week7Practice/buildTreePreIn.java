package PREP2025.Practice.Week7Practice;


import java.util.HashMap;

class TreeNode1{
    int value;
    TreeNode1 left, right;
    TreeNode1(int x){value= x;}
}
class Solution2{
    int preIndex = 0;
    HashMap<Integer, Integer> inMap = new HashMap<>();

   public TreeNode1 buildTree(int[] preorder, int[] inorder){
       for (int i = 0; i < inorder.length; i++) {
           inMap.put(inorder[i],i);
       }
       return build(preorder, 0, inorder.length-1);
   }
   public TreeNode1 build(int[] preorder, int start, int end){
       if (start>end) return null;
       int rootVal = preorder[preIndex++];
       TreeNode1 root = new TreeNode1(rootVal);
       int mid =inMap.get(rootVal);
       root.left = build(preorder, start, mid-1);
       root.right = build(preorder, mid+1, end);
       return root;
   }
}

public class buildTreePreIn {
    static void main() {
        Solution2 sol = new Solution2();
        int[] preorder = {3,9,20,15,7};
        int[] inorder  = {9,3,15,20,7};

        TreeNode1 node = sol.buildTree(preorder,inorder);
        System.out.println(node.value);
        System.out.println(node.left.value);
        System.out.println(node.right.value);
    }
}
