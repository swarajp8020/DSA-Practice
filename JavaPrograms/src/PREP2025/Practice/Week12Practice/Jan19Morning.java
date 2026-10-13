package PREP2025.Practice.Week12Practice;

import java.util.LinkedList;
import java.util.Queue;

public class Jan19Morning {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) {
                    q.offer(new int[]{r, c});
                } else if (grid[r][c] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0) return 0;
        int minutes = 0;
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0, -1}};
        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] cell = q.poll();
                int r = cell[0];
                int c = cell[1];
                for (int[] d: dirs) {
                    int nr = r + d[0];
                    int nc = c + d[1];
                    if (nr >= 0 && nc >= 0 && nr < row && nc < cols && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
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
        Jan19Morning obj = new Jan19Morning();
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
//   public int numIslands(char[][] grid) {
//       int rows = grid.length;
//       int cols = grid[0].length;
//       int count = 0;
//       for (int r = 0; r < rows; r++) {
//           for (int c = 0; c < cols; c++) {
//               if (grid[r][c] == '1') {
//                   count++;
//                   dfs(grid, r, c);
//               }
//           }
//       }
//       return count;
//   }
//   private void dfs(char[][] grid, int r, int c) {
//       int row = grid.length;
//       int cols = grid[0].length;
//       if (r < 0 || c < 0 || r >= row || c >= cols || grid[r][c] == '0') {
//           return;
//       }
//       grid[r][c] = '0';
//       dfs(grid, r+1, c);
//       dfs(grid, r-1, c);
//       dfs(grid, r, c+1);
//       dfs(grid, r, c-1);
//   }
//    static void main() {
//        char[][] grid = {
//                {'1','1','1','1','0'},
//                {'1','1','0','1','0'},
//                {'1','1','0','0','0'},
//                {'0','0','0','0','0'}
//        };
//        Jan19Morning obj = new Jan19Morning();
//        System.out.println(obj.numIslands(grid)); // Expected: 1
//    }
}
