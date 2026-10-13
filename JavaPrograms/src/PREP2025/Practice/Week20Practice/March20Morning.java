package PREP2025.Practice.Week20Practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/// Course Schedule
public class March20Morning {
    public static boolean canFinish(int totalCourses, int[][] prerequisites) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < totalCourses; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        int[] indegreeArray = new int[totalCourses];
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int dependency = prerequisite[1];
            adjacencyList.get(dependency).add(course);
            indegreeArray[course]++;
        }
        Queue<Integer> processingQueue = new LinkedList<>();
        for (int course = 0; course < totalCourses; course++) {
            if (indegreeArray[course] == 0) {
                processingQueue.offer(course);
            }
        }
        int completedCourses = 0;
        while (!processingQueue.isEmpty()) {
            int currentCourse = processingQueue.poll();
            completedCourses++;
            for (int neighborCourse : adjacencyList.get(currentCourse)) {
                indegreeArray[neighborCourse]--;
                if (indegreeArray[neighborCourse] == 0) {
                    processingQueue.offer(neighborCourse);
                }
            }
        }
        return completedCourses == totalCourses;
    }
    public static void main(String[] args) {
        int totalCourses = 2;
        int[][] prerequisites = {{1,0}};
        System.out.println(canFinish(totalCourses, prerequisites)); // true
    }
}
