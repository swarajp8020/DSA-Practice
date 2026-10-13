package PREP2025.Practice.Week16Practice;

import java.util.*;

public class Feb21Morning {
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
        Feb21Morning s = new Feb21Morning();
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
