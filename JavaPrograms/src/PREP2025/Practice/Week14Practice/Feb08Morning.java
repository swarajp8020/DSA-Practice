package PREP2025.Practice.Week14Practice;

import java.util.PriorityQueue;

public class Feb08Morning {
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a,b) -> a[0] - b[0]
        );
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            minHeap.add(new int[]{matrix[i][0], i, 0});
        }
        int result = 0;
        while (k-- > 0) {
            int[] curr = minHeap.poll();
            result = curr[0];
            int row = curr[1];
            int col = curr[2];
            if (col + 1 < n) {
                minHeap.add(new int[]{matrix[row][col+1], row, col + 1});
            }
        }
        return result;
    }

    static void main() {
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k =2;
        int result = kthSmallest(matrix, k);
        System.out.println("Kth Smallest Element: " + result);
    }
}
