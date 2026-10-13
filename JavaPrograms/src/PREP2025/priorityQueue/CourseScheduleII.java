package PREP2025.priorityQueue;
//Course Schedule II (LC 210)

import java.util.*;

/// 🧠 ELI5 Explanation
/// Imagine tasks with dependencies.
/// You can only take a course when all its prerequisites are done.
/// So we want:
/// 👉 A valid ordering of tasks.
/// This is called:
/// Topological Sorting
/// 🔎 Pattern Identification
/// Whenever you see:
/// Return order of tasks
/// Prerequisites
/// Dependency graph
/// Directed graph with ordering
/// Think:
/// 👉 Topological Sort
/// We’ll solve it using BFS (Kahn’s Algorithm).
/// 💡 Core Idea (Kahn’s Algorithm)
/// Build graph (adjacency list)
/// Compute indegree of each node
/// Put all nodes with indegree 0 into queue
/// Remove them one by one:
/// Add to result
/// Reduce indegree of neighbors
/// If neighbor becomes 0 → push to queue
/// If result size == numCourses → valid
/// Else → cycle exists
// 🎯 Interview Explanation (4 lines)
/// This is a topological PREP2025.sorting problem on a directed graph.
/// I compute indegrees and start with nodes having zero dependencies.
/// Using BFS, I remove nodes and reduce indegrees of neighbors.
/// If all courses are processed, we return the order; otherwise a cycle exists.
/// 📊 Complexity Time: O(V + E) Space: O(V + E)
public class CourseScheduleII {
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
        CourseScheduleII s = new CourseScheduleII();
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
