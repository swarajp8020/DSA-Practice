package PREP2025.priorityQueue;
// Network Delay Time (LC 743)

import java.util.*;

/// 🧠 ELI5 Explanation
/// Imagine you send a message from city K.
/// Roads have travel time.
/// What is the longest time needed for the message to reach every city?
/// This is:
/// 👉 Shortest Path from one source to all nodes
/// That means:
/// 👉 Dijkstra’s Algorithm
/// 🔎 Pattern Identification
/// Whenever you see:
/// Weighted graph
/// Shortest time
/// Minimum cost
/// Single source
/// Think:
/// 👉 Dijkstra (Min Heap)
/// 💡 Core Idea (Dijkstra)
/// Build adjacency list
/// Use min heap (distance, node)
/// Always expand the node with smallest distance
/// Update neighbor distances
/// Track maximum shortest distance
// 🎯 Interview Explanation (4 lines)
//This is a shortest path problem in a weighted directed graph.
//I use Dijkstra’s algorithm with a min heap.
//I always expand the node with smallest known distance.
//The maximum shortest distance gives the network delay time.
///📊 Complexity - Time: O(E log V), Space: O(V + E)
public class NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for(int[] t : times) {
            graph.computeIfAbsent(t[0], x -> new ArrayList<>())
                    .add(new int[]{t[1], t[2]});
        }
        PriorityQueue<int[]> minHeap =
                new PriorityQueue<>((a, b) -> a[0] - b[0]);
        minHeap.add(new int[]{0, k});
        Map<Integer, Integer> dist = new HashMap<>();
        while(!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int time = curr[0];
            int node = curr[1];
            if(dist.containsKey(node))
                continue;
            dist.put(node, time);
            if(graph.containsKey(node)) {
                for(int[] nei : graph.get(node)) {
                    int nextNode = nei[0];
                    int weight = nei[1];
                    if(!dist.containsKey(nextNode)) {
                        minHeap.add(new int[]{
                                time + weight,
                                nextNode
                        });
                    }
                }
            }
        }
        if(dist.size() != n)
            return -1;
        int max = 0;
        for(int d : dist.values())
            max = Math.max(max, d);
        return max;
    }
    static void main(String[] args) {
        NetworkDelayTime s = new NetworkDelayTime();
        int[][] times = {
                {2,1,1},
                {2,3,1},
                {3,4,1}
        };
        int n = 4;
        int k = 2;
        System.out.println("Network Delay Time: "
                + s.networkDelayTime(times, n, k));
    }
}
