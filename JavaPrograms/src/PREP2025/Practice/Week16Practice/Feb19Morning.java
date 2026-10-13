package PREP2025.Practice.Week16Practice;

import java.util.*;

public class Feb19Morning {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[numCourses];
        for(int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0) {
                queue.add(i);
            }
        }
        int[] result = new int[numCourses];
        int index = 0;
        while(!queue.isEmpty()) {
            int node = queue.poll();
            result[index++] = node;
            for(int neighbor : graph.get(node)) {
                indegree[neighbor]--;
                if(indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }
        if(index == numCourses)
            return result;
        else
            return new int[0];
    }
    static void main(String[] args) {
        Feb19Morning s = new Feb19Morning();
        int numCourses = 4;
        int[][] prerequisites = {
                {1,0},
                {2,0},
                {3,1},
                {3,2}
        };
        System.out.println(Arrays.toString(
                s.findOrder(numCourses, prerequisites)
        ));
    }
}
