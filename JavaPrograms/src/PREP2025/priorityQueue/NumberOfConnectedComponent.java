package PREP2025.priorityQueue;
// Number of Connected Components in an Undirected Graph
/// 🧠 ELI5 Explanation
/// Imagine people holding hands.
/// If you start from one person and can reach others by following hands,
/// they are in the same group.
/// Each isolated group is one connected component.
/// So the real question is:
/// 👉 How many separate groups exist?
/// 🔎 Pattern Identification
/// Whenever you see:
/// Count groups
/// Count islands
/// Count components
/// Undirected graph
/// Think:
/// 👉 DFS / BFS traversal + visited array
/// 💡 Core Idea
/// Build adjacency list
/// Maintain visited array
/// Loop through every node
/// If node not visited:
/// Do DFS/BFS
/// Increase component count
import java.util.ArrayList;
import java.util.List;

public class NumberOfConnectedComponent {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
        for(int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        boolean[] visited = new boolean[n];
        int components = 0;
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(i, graph, visited);
                components++;
            }
        }
        return components;
    }
    private void dfs(int node,
                     List<List<Integer>> graph,
                     boolean[] visited) {
        visited[node] = true;
        for(int neighbor : graph.get(node)) {
            if(!visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
    }
    public static void main(String[] args) {
        NumberOfConnectedComponent s = new NumberOfConnectedComponent();
        int n = 5;
        int[][] edges = {
                {0,1},
                {1,2},
                {3,4}
        };
        System.out.println("Connected Components: " +
                s.countComponents(n, edges));
    }
}
