package PREP2025.Practice.Week14Practice;

import java.util.Arrays;

public class Feb04Morning {
    //productExceptSelf
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }
    static void main() {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    // number of Islands
//    public static int numIslands(char[][] grid) {
//        int rows = grid.length;
//        int cols = grid[0].length;
//        int count = 0;
//        for (int r = 0; r < rows; r++) {
//            for (int c = 0; c < cols; c++) {
//                if (grid[r][c] == '1') {
//                    count++;
//                    dfs(grid, r, c);
//                }
//            }
//        }
//        return count;
//    }
//    private static void dfs(char[][] grid, int r, int c) {
//        int rows = grid.length;
//        int cols = grid[0].length;
//        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0') {
//            return;
//        }
//        grid[r][c] = '0';
//        dfs(grid, r + 1, c);
//        dfs(grid, r - 1, c);
//        dfs(grid, r, c + 1);
//        dfs(grid, r, c - 1);
//    }
//    static void main() {
//        char[][] grid = {
//                {'1','1','1','1','0'},
//                {'1','1','0','1','0'},
//                {'1','1','0','0','0'},
//                {'0','0','0','0','0'}
//        };
//        System.out.println(numIslands(grid)); // Expected: 1
//    }
}
