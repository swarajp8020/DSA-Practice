package PREP2025.graphs;

// LC 994. Rotting Oranges https://leetcode.com/problems/rotting-oranges/description/?envType=problem-list-v2&envId=woadf8qd

import java.util.LinkedList;
import java.util.Queue;

/// ELI5 first
/// You have a box of oranges.
/// 0 = empty
/// 1 = fresh orange
/// 2 = rotten orange
/// Every minute:
/// A rotten orange makes its up/down/left/right fresh neighbors rotten.
/// Goal:
/// ✅ Find minimum minutes until no fresh left
/// If impossible → return -1
/// 2️⃣ Why BFS? (pattern)
/// BFS is for:
/// minimum steps / minimum time / level-by-level spread
/// Rotting spreads like a wave.
/// So BFS is perfect.
/// 3️⃣ Core BFS idea (important)
/// We do multi-source BFS:
/// Put all rotten oranges into queue at start.
/// Each BFS level = 1 minute
/// Track:
/// fresh count
/// queue size per minute (layer processing)
/// 4️⃣ BFS Steps
/// Step A: Scan grid
/// count fresh
/// add rotten positions to queue
/// Step B: BFS
/// while queue not empty AND fresh > 0:
/// process one level (all items currently in queue)
/// rot neighbors
/// decrement fresh
/// minutes++
/// Step C: Answer
/// if fresh == 0 → return minutes
/// else → return -1
public class rottingOranges {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        // Step 1: add all rotten to queue + count fresh
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) {
                    q.offer(new int[]{r, c});
                } else if (grid[r][c] == 1) {
                    fresh++;
                }
            }
        }
        // if no fresh oranges, already done
        if (fresh == 0) return 0;
        int minutes = 0;
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        // Step 2: BFS level by level
        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] cell = q.poll();
                int r = cell[0];
                int c = cell[1];
                for (int[] d : dirs) {
                    int nr = r + d[0];
                    int nc = c + d[1];
                    if (nr >= 0 && nc >= 0 && nr < rows && nc < cols && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;     // make rotten
                        fresh--;
                        q.offer(new int[]{nr, nc});
                    }
                }
            }
            minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }

    static void main(String[] args) {
        rottingOranges obj = new rottingOranges();
        int[][] grid1 = {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };
        System.out.println(obj.orangesRotting(grid1)); // Expected: 4
        int[][] grid2 = {
                {2,1,1},
                {0,1,1},
                {1,0,1}
        };
        System.out.println(obj.orangesRotting(grid2)); // Expected: -1
        int[][] grid3 = {
                {0,2}
        };
        System.out.println(obj.orangesRotting(grid3)); // Expected: 0
    }
}
