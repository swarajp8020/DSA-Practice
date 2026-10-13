package PREP2025.sorting;
/// ELI5 Explanation
/// Imagine you have k already sorted PREP2025.arrays:
/// {1 → 4 → 7}
/// {2 → 5 → 8}
/// {}3 → 6 → 9}
/// You want to combine them into ONE big sorted list.
/// You could merge them one by one – but that becomes slow.
/// Better idea:
/// Look at the first element of each list and always pick the smallest.
/// That’s exactly what a min-heap does.
/// Pattern Identification
/// Whenever you see:
/// • merge k sorted lists
/// • merge k sorted PREP2025.arrays
/// • combine multiple sorted streams
/// Think:
/// 👉 Min-Heap + Linked List nodes
import java.util.Arrays;
import java.util.PriorityQueue;

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
