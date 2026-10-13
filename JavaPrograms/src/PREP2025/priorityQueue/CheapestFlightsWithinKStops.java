package PREP2025.priorityQueue;
//Cheapest Flights Within K Stops (LC 787)

import java.util.*;

/// 🧠 ELI5 Explanation
/// You want the cheapest flight.
/// But you cannot take too many layovers.
/// So you must track:
/// Current cost
/// Current city
/// Stops used
/// This is like Dijkstra… but with an extra constraint: stops.
/// 🔎 Pattern Identification
/// Whenever you see:
/// Cheapest path
/// Weighted graph
/// Stop constraint
/// Think:
/// 👉 Modified Dijkstra / BFS with state tracking
/// 💡 Core Idea
/// We use:
/// Min Heap storing:
/// (cost, city, stops)
/// We allow expansion only if stops ≤ k.
/// Important:
/// Even if we visited a city before,
/// we may revisit it with fewer stops or lower cost.
// 🎯 Interview Explanation (4 lines)
//This is a shortest path problem with a stop constraint.
//I use a min heap storing cost, city, and stops used.
//I expand nodes only if stops are within limit.
//The first time I reach the destination gives the minimum cost.
//📊 Complexity Time ≈ O(E log V), Space ≈ O(V + E)
public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights,
                                 int src, int dst, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for(int[] flight : flights) {
            graph.computeIfAbsent(flight[0], x -> new ArrayList<>())
                    .add(new int[]{flight[1], flight[2]});
        }
        PriorityQueue<int[]> minHeap =
                new PriorityQueue<>((a, b) -> a[0] - b[0]);
        // {cost, city, stops}
        minHeap.add(new int[]{0, src, 0});
        while(!minHeap.isEmpty()) {
            int[] curr = minHeap.poll();
            int cost = curr[0];
            int city = curr[1];
            int stops = curr[2];
            if(city == dst)
                return cost;
            if(stops > k)
                continue;
            if(graph.containsKey(city)) {
                for(int[] neighbor : graph.get(city)) {

                    int nextCity = neighbor[0];
                    int price = neighbor[1];
                    minHeap.add(new int[]{
                            cost + price,
                            nextCity,
                            stops + 1
                    });
                }
            }
        }
        return -1;
    }
    static void main(String[] args) {
        CheapestFlightsWithinKStops s = new CheapestFlightsWithinKStops();
        int n = 4;
        int[][] flights = {
                {0,1,100},
                {1,2,100},
                {0,2,500},
                {2,3,100}
        };
        int src = 0;
        int dst = 3;
        int k = 1;

        System.out.println("Cheapest Price: "
                + s.findCheapestPrice(n, flights, src, dst, k));
    }
}
