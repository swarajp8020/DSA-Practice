package PREP2025.Practice.Week17Practice;

import java.util.ArrayList;
import java.util.List;

public class Feb23Morning {
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
        Feb23Morning s = new Feb23Morning();
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
