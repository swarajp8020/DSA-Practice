package PREP2025.Practice.Week14Practice;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Feb06Morning {
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

    static void main(String[] args){
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
