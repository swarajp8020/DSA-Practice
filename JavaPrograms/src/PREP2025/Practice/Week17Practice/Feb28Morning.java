package PREP2025.Practice.Week17Practice;


import java.util.LinkedList;
import java.util.Queue;

public class Feb28Morning {
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
        Feb28Morning s = new Feb28Morning();
        int[][] grid = {
                {0,1},
                {1,0}
        };
        System.out.println("Shortest Path: "
                + s.shortestPathBinaryMatrix(grid));
    }
}
