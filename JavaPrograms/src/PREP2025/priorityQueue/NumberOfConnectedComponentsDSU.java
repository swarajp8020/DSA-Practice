package PREP2025.priorityQueue;
// Number of Connected Components – Using Union Find (DSU)
/// 🧠 ELI5 Explanation
/// Imagine each node starts as its own team.
/// Every time you see an edge like:
/// u — v
/// You merge their teams.
/// At the end, the number of teams left = number of connected components.
/// That’s it.
/// This merging system is called:
/// 👉 Union Find / Disjoint Set Union (DSU)
/// 🔎 Pattern Identification
/// Whenever you see:
/// Count connected components
/// Dynamic connectivity
/// Many merge operations
/// Network connectivity queries
/// Think:
/// 👉 Union Find
/// 💡 Core Idea
/// We maintain:
/// parent[] → who is leader of each node
/// rank[] → helps balance tree
/// Two main operations:
/// find(x) → find root parent
/// union(x, y) → merge two sets
public class NumberOfConnectedComponentsDSU {
    int[] parent;
    int[] rank;
    public int countComponents(int n, int[][] edges) {
        parent = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
        int components = n;
        for(int[] edge : edges) {
            if(union(edge[0], edge[1])) {
                components--;
            }
        }
        return components;
    }
    private int find(int x) {
        if(parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    private boolean union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if(rootX == rootY)
            return false;
        if(rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        }
        else if(rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        }
        else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
        return true;
    }
    static void main(String[] args) {
        NumberOfConnectedComponentsDSU s = new NumberOfConnectedComponentsDSU();
        int n = 5;
        int[][] edges = {
                {0,1},
                {1,2},
                {3,4}
        };
        System.out.println("Connected Components (Union Find): "
                + s.countComponents(n, edges));
    }
}
