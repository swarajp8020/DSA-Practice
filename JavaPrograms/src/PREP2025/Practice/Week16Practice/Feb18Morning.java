package PREP2025.Practice.Week16Practice;


import java.util.ArrayList;
import java.util.List;

public class Feb18Morning {
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
        Feb18Morning s = new Feb18Morning();
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};
        System.out.println("Can finish: " +
                s.canFinish(numCourses, prerequisites));
    }
}
