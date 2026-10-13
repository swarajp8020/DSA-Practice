package PREP2025.Practice.Week16Practice;

import java.util.ArrayList;
import java.util.List;

public class Feb20Morning {
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
        Feb20Morning s = new Feb20Morning();
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
