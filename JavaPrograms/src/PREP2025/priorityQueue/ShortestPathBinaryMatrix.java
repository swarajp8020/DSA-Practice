package PREP2025.priorityQueue;

// LC 1091 – Shortest Path in Binary Matrix
/// 🧠 ELI5 Explanation
/// Imagine a maze.
/// White cells (0) are walkable.
/// Black cells (1) are walls.
/// You want to reach from start to end
/// using the minimum number of steps.
/// Since every move costs the same (1 step),
/// 👉 This is a classic BFS shortest path problem.
/// 🔎 Pattern Identification
/// Whenever you see:
/// Shortest path
/// Unweighted grid
/// Equal step cost
/// Minimum moves
/// Think:
/// 👉 BFS
/// Not DFS.
/// Not Dijkstra.
/// Just BFS.
/// ❗ Important Edge Case
/// If:
/// grid[0][0] == 1
/// OR
/// grid[n-1][n-1] == 1
/// Return -1 immediately.
/// Because start or end is blocked.
/// 💡 Core Idea
/// If start blocked → return -1
/// Use queue (BFS)
/// Mark visited cells
/// Explore all 8 directions
/// Return distance when reaching bottom-right
/// 🎯 Interview Explanation (4 lines)
/// This is an unweighted shortest path problem on a grid.
/// Since all moves cost 1, I use BFS.
/// I explore all 8 directions and track distance level by level.
/// The first time I reach bottom-right gives the shortest path.
/// 📊 Complexity
/// Time: O(n²)
/// Space: O(n²)

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1)
            return -1;
        int[][] directions = {
                {1,0},{-1,0},{0,1},{0,-1},
                {1,1},{1,-1},{-1,1},{-1,-1}
        };
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        grid[0][0] = 1; // mark visited
        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            int dist = curr[2];
            if(r == n - 1 && c == n - 1)
                return dist;
            for(int[] dir : directions) {
                int newR = r + dir[0];
                int newC = c + dir[1];
                if(newR >= 0 && newR < n &&
                        newC >= 0 && newC < n &&
                        grid[newR][newC] == 0) {
                    queue.offer(new int[]{
                            newR, newC, dist + 1
                    });
                    grid[newR][newC] = 1;
                }
            }
        }
        return -1;
    }
    static void main(String[] args) {
        ShortestPathBinaryMatrix s = new ShortestPathBinaryMatrix();
        int[][] grid = {
                {0,1},
                {1,0}
        };
        System.out.println("Shortest Path: "
                + s.shortestPathBinaryMatrix(grid));
    }
}
