package PREP2025.Practice.Week11Practice;

import PREP2025.graphs.rottingOranges;

import java.util.LinkedList;
import java.util.Queue;

public class rottenOranges {
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
