package PREP2025.Practice.Week21Practice;
/// Shortest Path in Binary Matrix
import java.util.LinkedList;
import java.util.Queue;

public class March26Morning {
    public static int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n-1][n-1] == 1) {
            return -1;
        }
        int[][] directions = {
                {-1,-1},{-1,0},{-1,1},
                {0,-1},        {0,1},
                {1,-1},{1,0},{1,1}
        };
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        grid[0][0] = 1; // mark visited
        int pathLength = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int row = cell[0];
                int col = cell[1];
                if (row == n - 1 && col == n - 1) {
                    return pathLength;
                }
                for (int[] direction : directions) {
                    int newRow = row + direction[0];
                    int newCol = col + direction[1];
                    if (newRow >= 0 && newCol >= 0 &&
                            newRow < n && newCol < n &&
                            grid[newRow][newCol] == 0) {
                        queue.offer(new int[]{newRow, newCol});
                        grid[newRow][newCol] = 1; // mark visited
                    }
                }
            }
            pathLength++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] grid = {
                {0,1},
                {1,0}
        };
        System.out.println(shortestPathBinaryMatrix(grid)); // 2
    }
}
