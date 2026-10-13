package PREP2025.Practice.Week17Practice;

import java.util.*;

public class Feb24Morning {
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
        Feb24Morning s = new Feb24Morning();
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
