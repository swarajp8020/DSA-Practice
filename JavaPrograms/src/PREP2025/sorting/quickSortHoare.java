package PREP2025.sorting;

import java.util.Arrays;
//Hoare's partitioning algorithm i
//A. QuickSort with Middle Pivot (Fixed version) pivot = middle element
//Just like choosing the middle paper/book.
//left pointer
//Walks from the start until it finds something wrong
//(something bigger than pivot).
//right pointer
//Walks from the end until it finds something wrong
//(something smaller than pivot).
//If both found wrong elements → swap.
//That’s literally it.
//When left passes right → stop.
//Because left side is now full of small stuff,
//right side full of big stuff.
// QuickSort using Hoare Partition (pivot = middle element)
public class quickSortHoare {
    public static void main(String[] args) {
        int[] arr = {7, 5, 8, 2, 4, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int left, int right) {

        // Stop when only one element or invalid segment
        if (left >= right) return;

        // Partition array → pivotIndex splits the array
        int pivotIndex = partition(arr, left, right);

        // Sort left half (everything before pivot zone)
        quickSort(arr, left, pivotIndex);

        // Sort right half (everything after pivot zone)
        quickSort(arr, pivotIndex + 1, right);
    }

    static int partition(int[] arr, int left, int right) {

        // Choose pivot = EXACT MIDDLE element
        int pivot = arr[(left + right) / 2];

        while (true) {

            // Move left pointer right until you find a value >= pivot
            while (arr[left] < pivot) left++;

            // Move right pointer left until you find value <= pivot
            while (arr[right] > pivot) right--;

            // If pointers cross → all small elements on left,
            // all big elements on right → STOP
            if (left >= right) return right;

            // Swap wrong elements
            // arr[left] should be smaller, arr[right] should be bigger
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers inward
            left++;
            right--;
        }
    }
}
