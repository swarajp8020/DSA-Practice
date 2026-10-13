package PREP2025.priorityQueue;
// Longest Increasing Path in a Matrix (LC 329) https://leetcode.com/problems/longest-increasing-path-in-a-matrix/description/
/// 🧠 ELI5 Explanation
/// Imagine standing on a number.
/// You can only move to a bigger number.
/// From each cell, you want to know:
/// 👉 “How long is the longest increasing path starting here?”
/// Instead of recalculating again and again,
/// we memorize results.
/// This is:
/// 👉 DFS + Memoization (Top-down DP)
/// 🔎 Pattern Identification
/// Whenever you see:
/// Matrix traversal
/// Increasing condition
/// Longest path
/// Repeated subproblems
/// Think:
/// 👉 DFS + Memoization
/// 💡 Core Idea
/// For each cell:
/// Try all 4 directions
/// Move only if next value is greater
/// Recursively compute longest path
/// Store result in dp[][] to avoid recomputation
// 🎯 Interview Explanation (4 lines)
//This is a DFS with memoization problem.
//For each cell, I compute the longest increasing path starting there.
//I store results in a dp array to avoid recomputation.
//Time complexity becomes O(m × n).
//📊 Complexity Without memoization: exponential With memoization: Time = O(m × n) Space = O(m × n)
public class LongestIncreasingPathMatrix {
    private int[][] matrix;
    private int[][] dp;
    private int rows, cols;

    public int longestIncreasingPath(int[][] matrix) {

        if(matrix == null || matrix.length == 0)
            return 0;

        this.matrix = matrix;
        rows = matrix.length;
        cols = matrix[0].length;

        dp = new int[rows][cols];

        int max = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                max = Math.max(max, dfs(i, j));
            }
        }

        return max;
    }

    private int dfs(int r, int c) {

        if(dp[r][c] != 0)
            return dp[r][c];

        int maxPath = 1; // at least itself

        int[][] directions = {
                {1,0},{-1,0},{0,1},{0,-1}
        };

        for(int[] dir : directions) {

            int newRow = r + dir[0];
            int newCol = c + dir[1];

            if(newRow >= 0 && newRow < rows &&
                    newCol >= 0 && newCol < cols &&
                    matrix[newRow][newCol] > matrix[r][c]) {

                maxPath = Math.max(maxPath,
                        1 + dfs(newRow, newCol));
            }
        }

        dp[r][c] = maxPath;
        return maxPath;
    }

     static void main(String[] args) {
        LongestIncreasingPathMatrix s = new LongestIncreasingPathMatrix();
        int[][] matrix = {
                {9,9,4},
                {6,6,8},
                {2,1,1}
        };
        System.out.println("Longest Increasing Path: "
                + s.longestIncreasingPath(matrix));
    }
}
