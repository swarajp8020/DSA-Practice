package PREP2025.Practice.Week8Practice.trees;
import java.util.ArrayList;
import java.util.List;
/// Path Sum II (DFS + Backtracking)
/// What the problem asks
/// Return all root → leaf paths where the sum of node values equals targetSum.
/// Key constraints
/// Path must start at root
/// Path must end at leaf
/// Multiple paths possible
/// Core idea
/// We carry two states while going down:
/// Remaining sum
/// Current path (list)
/// Mental model (ELI5)
/// Walk from root to leaf
/// Write down values as you go
/// Subtract value from target
/// If you reach a leaf and sum becomes 0 → record path
/// While returning, erase the last value (backtracking)
/// Why backtracking is mandatory
/// Because the same path list is reused across branches.
/// If you don’t remove:
/// Left branch values pollute right branch paths
/// Interview explanation
/// “I use DFS with backtracking.
/// I maintain a current path and remaining sum.
/// At each node, I add the value, recurse, and remove it while backtracking.
/// When I reach a leaf with remaining sum zero, I store a copy of the path.”
public class pathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, targetSum, path, res);
        return res;
    }
    private void dfs(TreeNode node, int target, List<Integer> path, List<List<Integer>>res){
        if (node == null) return;
        path.add(node.value);
        if (node.left == null && node.right == null && node.value == target){
            res.add(new ArrayList<>(path));
        }
        dfs(node.left, target-node.value, path, res);
        dfs(node.right, target-node.value, path,res);
        path.remove(path.size()-1);
    }
    static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        pathSum2 sol = new pathSum2();
        System.out.println(sol.pathSum(root, 22));
    }
}
