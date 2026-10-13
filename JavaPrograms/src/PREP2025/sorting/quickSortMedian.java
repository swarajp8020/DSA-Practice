package PREP2025.sorting;

import java.util.Arrays;


public class quickSortMedian {
    public static void main(String[] args) {
        int[] arr = {6,5,1,7,2,0};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        // Step 1: Fix pivot to be median of (left, mid, right)
        int medianIndex = medianOfThree(arr, left, right);
        swap(arr, medianIndex, right); // put pivot at right

        // Step 2: Standard Lomuto partition
        int pivotIndex = partition(arr, left, right);

        // Step 3: Recurse left + right
        quickSort(arr, left, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, right);
    }

    // Find median among: arr[left], arr[mid], arr[right]
    static int medianOfThree(int[] arr, int left, int right) {
        int mid = left + (right - left) / 2;

        // If left > mid → fix it
        if (arr[left] > arr[mid]) swap(arr, left, mid);
        // If mid > right → fix it
        if (arr[mid] > arr[right]) swap(arr, mid, right);
        // Fix again left > mid
        if (arr[left] > arr[mid]) swap(arr, left, mid);

        return mid; // mid now holds the median element
    }

    static int partition(int[] arr, int left, int right) {
        int pivot = arr[right]; // pivot already placed here
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) { // push small guys to left
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

