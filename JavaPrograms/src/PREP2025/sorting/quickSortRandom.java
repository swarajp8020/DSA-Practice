package PREP2025.sorting;

import java.util.Arrays;

public class quickSortRandom {
        public static void main(String[] args) {
            int[] arr = {7, 2, 9, 4, 1, 8, 3};
            quickSortRandom(arr, 0, arr.length - 1);
            //Array range: 0 → length, not 0 → last index
            //Random index tried to pick elements beyond array boundary
            //So swaps were happening with index outside array → runtime crash
            System.out.println(Arrays.toString(arr));
        }

        static void quickSortRandom(int[] arr, int left, int right) {
            if (left >= right) return;

            // 1) Pick random pivot index
            int randomIndex = left + (int)(Math.random() * (right - left + 1));

            // 2) Swap that pivot to end (Lomuto requires pivot at right)
            swap(arr, randomIndex, right);

            // 3) Use normal Lomuto partition
            int pivotIndex = partition(arr, left, right);

            // 4) Recurse
            quickSortRandom(arr, left, pivotIndex - 1);
            quickSortRandom(arr, pivotIndex + 1, right);
        }

        static int partition(int[] arr, int left, int right) {
            int pivot = arr[right];
            int i = left - 1;

            for (int j = left; j < right; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr, i + 1, right);
            return i + 1;
        }

        static void swap(int[] arr, int a, int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
}
