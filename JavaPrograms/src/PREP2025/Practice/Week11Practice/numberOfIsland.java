package PREP2025.Practice.Week11Practice;

public class numberOfIsland {
    public int numIslands(char[][] grid){
        int row = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    count++;
                    dfs(grid, r, c);
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int r, int c) {
        int row = grid.length;
        int cols = grid[0].length;
        if (r < 0 || c < 0 || r >= row || c >= cols || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';
        dfs(grid, r+1, c);
        dfs(grid, r-1,c);
        dfs(grid, r, c+1);
        dfs(grid, r, c-1);
    }
    static void main() {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        PREP2025.graphs.numberOfIsland obj = new PREP2025.graphs.numberOfIsland();
        System.out.println(obj.numIslands(grid));
    }
}
