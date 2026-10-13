package PREP2025.Practice.Week22Practice;

import java.util.LinkedList;
import java.util.Queue;

/// Rotting Oranges
public class March30Morning {
    public static int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 2) {
                    queue.offer(new int[]{row, col});
                }
                if (grid[row][col] == 1) {
                    freshCount++;
                }
            }
        }
        int minutes = 0;
        int[][] directions = {
                {1,0}, {-1,0}, {0,1}, {0,-1}
        };
        while (!queue.isEmpty() && freshCount > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] currentCell = queue.poll();
                int row = currentCell[0];
                int col = currentCell[1];
                for (int[] direction : directions) {
                    int newRow = row + direction[0];
                    int newCol = col + direction[1];

                    if (newRow >= 0 && newCol >= 0 &&
                            newRow < rows && newCol < cols &&
                            grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        queue.offer(new int[]{newRow, newCol});
                        freshCount--;
                    }
                }
            }
            minutes++;
        }
        return freshCount == 0 ? minutes : -1;
    }
    public static void main(String[] args) {
        int[][] grid = {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };
        System.out.println(orangesRotting(grid)); // 4
    }
}
