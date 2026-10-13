package PREP2025.Practice.Week20Practice;
/// Number of Connected Components in an Undirected Graph
public class March18Morning {
    static class UnionFind {
        int[] parentArray;
        int[] rankArray;
        int componentCount;
        public UnionFind(int totalNodes) {
            parentArray = new int[totalNodes];
            rankArray = new int[totalNodes];
            componentCount = totalNodes;
            for (int index = 0; index < totalNodes; index++) {
                parentArray[index] = index;
                rankArray[index] = 1;
            }
        }
        public int findParent(int node) {
            if (parentArray[node] != node) {
                parentArray[node] = findParent(parentArray[node]); // path compression
            }
            return parentArray[node];
        }
        public void unionNodes(int nodeA, int nodeB) {
            int parentA = findParent(nodeA);
            int parentB = findParent(nodeB);
            if (parentA == parentB) {
                return;
            }
            if (rankArray[parentA] > rankArray[parentB]) {
                parentArray[parentB] = parentA;
            } else if (rankArray[parentA] < rankArray[parentB]) {
                parentArray[parentA] = parentB;
            } else {
                parentArray[parentB] = parentA;
                rankArray[parentA]++;
            }
            componentCount--;
        }
    }
    public static int countComponents(int totalNodes, int[][] edges) {
        UnionFind unionFind = new UnionFind(totalNodes);
        for (int[] edge : edges) {
            unionFind.unionNodes(edge[0], edge[1]);
        }
        return unionFind.componentCount;
    }
    public static void main(String[] args) {

        int totalNodes = 5;
        int[][] edges = {
                {0,1}, {1,2}, {3,4}
        };

        System.out.println(countComponents(totalNodes, edges)); // 2
    }
}
