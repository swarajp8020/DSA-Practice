package PREP2025.Practice.WeekdayPractice;
class TreeNode1{
    int value;
    TreeNode1 left,right;
    TreeNode1(int x){value=x;}
}
public class DiameterBT {
    public static int diameterOfBT(TreeNode1 node){
        diameter =0;
        height(node);
        return diameter;
    }
    static int diameter = 0;
    private static int height(TreeNode1 root){
        if (root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        diameter = Math.max(diameter, right+left);
        return 1 + Math.max(left,right);
    }
    public static void main(String[] args) {
    TreeNode1 node1 = new TreeNode1(5);
    node1.left = new TreeNode1(4);
    node1.right = new TreeNode1(3);
    node1.left.left = new TreeNode1(2);
    node1.left.right = new TreeNode1(1);
        System.out.println(diameterOfBT(node1));
    }
}
