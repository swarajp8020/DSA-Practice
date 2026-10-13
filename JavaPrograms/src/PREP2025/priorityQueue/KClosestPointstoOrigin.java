package PREP2025.priorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;
// LC K Closest Points to Origin (LC 973) https://leetcode.com/problems/k-closest-points-to-origin/
/// ELI5 Refresher
/// You want the k nearest people to you.
/// Instead of PREP2025.sorting everyone,
/// just keep a small box of size k with the closest ones.
/// Whenever someone farther comes in, throw them out.
/// That’s a max heap.
// Interview Explanation
//I compute distance of each point from origin.
//I maintain a max-heap of size k storing closest points.
//Whenever size exceeds k, I remove the farthest point.
//Finally the heap contains exactly k closest points.
public class KClosestPointstoOrigin {
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1])
        );
        for(int[] point : points) {
            maxHeap.add(point);

            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        int[][] result = new int[k][2];
        int i = 0;
        while(!maxHeap.isEmpty()) {
            result[i++] = maxHeap.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] points = {
                {1,3},
                {-2,2},
                {5,8},
                {0,1}
        };
        int k = 2;
        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }
}
