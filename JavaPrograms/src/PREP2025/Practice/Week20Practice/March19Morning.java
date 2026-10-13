package PREP2025.Practice.Week20Practice;

import java.util.PriorityQueue;

/// K Closest Points to Origin
public class March19Morning {

    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (pointA, pointB) -> getDistance(pointB) - getDistance(pointA)
        );
        for (int[] currentPoint : points) {
            maxHeap.offer(currentPoint);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove farthest
            }
        }
        int[][] result = new int[k][2];
        for (int index = 0; index < k; index++) {
            result[index] = maxHeap.poll();
        }
        return result;
    }
    private static int getDistance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
    public static void main(String[] args) {
        int[][] points = {{1,3}, {-2,2}};
        int k = 1;
        int[][] result = kClosest(points, k);
        for (int[] point : result) {
            System.out.println(point[0] + "," + point[1]);
        }
    }
}
