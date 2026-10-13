package PREP2025.graphs;

// LC 200 Number of Islands - https://leetcode.com/problems/number-of-islands/description/?envType=problem-list-v2&envId=rr2ss0g5
/// Grid of '1' (land) and '0' (water)
/// An island = group of connected lands (up/down/left/right)
/// Goal:
/// Count how many separate islands exist.
/// Pattern
/// Loop all cells:
/// if cell is '1' and not visited → found a new island
/// do DFS/BFS to mark the whole island visited
/// Each DFS/BFS call = 1 island.
/// Why this works (short + durable)
/// Every time you find unvisited land → it’s a new island
/// DFS floods the entire island and turns it into water ('0')
/// So that island never gets counted again
/// 🚨 Common mistakes (catch early)
/// ❌ Forgetting boundaries
/// ❌ Not marking visited (infinite recursion)
/// ❌ Diagonal connection assumed (NO diagonal here)
//Interview line - “Whenever I find land, I count one island and DFS flood-fill it to water so it won’t be counted again.”
public class numberOfIsland {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for (int r = 0; r < rows; r++) {
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
        int rows = grid.length;
        int cols = grid[0].length;
        // out of bounds OR water
        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0') {
            return;
        }
        // mark visited
        grid[r][c] = '0';
        // explore 4 directions
        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }
    static void main() {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        numberOfIsland obj = new numberOfIsland();
        System.out.println(obj.numIslands(grid)); // Expected: 1
    }
}
