package PREP2025.priorityQueue;
// Course Schedule (LC 207)

import java.util.ArrayList;
import java.util.List;

/// ELI5 Explanation
/// Think of courses as tasks.
/// If course A depends on B,
/// and B depends on C,
/// and C depends on A…
/// You are stuck.
/// That’s a cycle.
/// If there is a cycle in dependencies → impossible to finish.
/// So the real question is:
/// 👉 Does the graph contain a cycle?
/// 🔎 Pattern Identification
/// Whenever you see:
/// Prerequisites
/// Dependencies
/// Task ordering
/// Can finish all tasks?
/// Think:
/// 👉 Directed Graph + Cycle Detection
/// 💡 Core Idea
/// Build adjacency list
/// Use DFS
/// Track 3 states:
/// 0 = not visited
/// 1 = visiting (in recursion PREP2025.stack)
/// 2 = visited
/// If during DFS you reach a node that is already “visiting” → cycle found.
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
        }
        int[] visited = new int[numCourses];
        for(int i = 0; i < numCourses; i++) {
            if(!dfs(i, graph, visited)) {
                return false;
            }
        }
        return true;
    }
    private boolean dfs(int course,
                        List<List<Integer>> graph,
                        int[] visited) {
        if(visited[course] == 1) return false;
        if(visited[course] == 2) return true;
        visited[course] = 1;
        for(int neighbor : graph.get(course)) {
            if(!dfs(neighbor, graph, visited))
                return false;
        }
        visited[course] = 2;
        return true;
    }
    public static void main(String[] args) {
        CourseSchedule s = new CourseSchedule();
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};
        System.out.println("Can finish: " +
                s.canFinish(numCourses, prerequisites));
    }
}
