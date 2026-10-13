package PREP2025.priorityQueue;
// Minimum Spanning Tree – Kruskal’s Algorithm Minimum Spanning Tree – Kruskal’s Algorithm
/// 🧠 ELI5 Explanation
/// Imagine cities that need roads.
/// You want:
/// 👉 Connect all cities
/// 👉 Use minimum total road cost
/// 👉 No cycles
/// 👉 Everyone must be reachable
/// That is called:
/// 👉 Minimum Spanning Tree (MST)
/// 🔎 Pattern Identification
/// Whenever you see:
/// Connect all nodes
/// Minimum total cost
/// Undirected weighted graph
/// No cycles
/// Think:
/// 👉 Minimum Spanning Tree
/// Two ways:
/// Kruskal (Union Find)
/// Prim (Heap)
/// Today we use Kruskal.
/// 💡 Core Idea (Kruskal)
/// Build all possible edges with weights
/// Sort edges by weight
/// Pick smallest edge
/// If it doesn’t form a cycle → include it
/// Use Union Find to detect cycle
/// Stop when we used (n-1) edges
/// 🎯 Interview Explanation (4 lines)
/// This is a Minimum Spanning Tree problem.
/// I generate all edges and sort them by weight.
/// Using Union Find, I greedily pick smallest edges that don’t form cycles.
/// After selecting n-1 edges, I return total cost.
// 📊 Complexity  Edge generation: O(n²), Sorting: O(n² log n²), Union Find ≈ constant, Total ≈ O(n² log n)
import java.util.ArrayList;
import java.util.List;

public class MinimumSpanningTreeKruskal {
    int[] parent;
    int[] rank;
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<int[]> edges = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int cost = Math.abs(points[i][0] - points[j][0]) +
                        Math.abs(points[i][1] - points[j][1]);
                edges.add(new int[]{cost, i, j});
            }
        }
        edges.sort((a, b) -> a[0] - b[0]);
        parent = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++)
            parent[i] = i;
        int totalCost = 0;
        int edgesUsed = 0;
        for(int[] edge : edges) {
            if(union(edge[1], edge[2])) {
                totalCost += edge[0];
                edgesUsed++;
                if(edgesUsed == n - 1)
                    break;
            }
        }
        return totalCost;
    }
    private int find(int x) {
        if(parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }
    private boolean union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if(rootX == rootY)
            return false;
        if(rank[rootX] > rank[rootY])
            parent[rootY] = rootX;
        else if(rank[rootX] < rank[rootY])
            parent[rootX] = rootY;
        else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
        return true;
    }
    static void main(String[] args) {
        MinimumSpanningTreeKruskal s = new MinimumSpanningTreeKruskal();
        int[][] points = {
                {0,0},
                {2,2},
                {3,10},
                {5,2},
                {7,0}
        };
        System.out.println("Minimum Cost: "
                + s.minCostConnectPoints(points));
    }
}
