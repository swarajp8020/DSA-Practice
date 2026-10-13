package PREP2025.sorting;

import java.util.Arrays;

//Dutch National Flag Partition
public class quickSortDNF {
    public static void main(String[] args) {
//        int[] arr = {6,3,5,7,8,1,2};
//        int[] arr ={3,3,3,3};
//        int[] arr = {5,4,3,2,1};
//        int[] arr = {1,5,1,5,1,5};
        int[] arr = {7,5,1,8,0,2,-1,4,1};
        quickSortDNF(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
     static void quickSortDNF(int[] arr, int left, int right) {
        // Base case: if there is 0 or 1 element -> already sorted
        if (left >= right) return;

        // Partition the array into 3 zones:
        // [smaller than pivot][equal to pivot][greater than pivot]
        int[] bounds = partitionDNF(arr, left, right);

        int low = bounds[0];   // end of "smaller than pivot" section
        int high = bounds[1];  // start of "greater than pivot" section

        // Sort only the parts that are not equal to the pivot
        quickSortDNF(arr, left, low - 1);  // left unsorted group
        quickSortDNF(arr, high + 1, right); // right unsorted group
    }

    static int[] partitionDNF(int[] arr, int left, int right) {

        int pivot = arr[(left + right) / 2];
        // pivot = middle element -> avoids worst case on sorted PREP2025.arrays

        int low = left;   // boundary of elements < pivot
        int mid = left;   // current explorer index
        int high = right; // boundary of elements > pivot

        while (mid <= high) {

            if (arr[mid] < pivot) {
                // Found smaller element -> move it LEFT zone
                swap(arr, low, mid);
                low++;  // expand smaller zone
                mid++;  // move explorer forward
            }

            else if (arr[mid] == pivot) {
                // Equal element -> it stays in the middle zone
                mid++;  // just move forward
            }

            else {
                // Found larger element -> push to RIGHT zone
                swap(arr, mid, high);
                high--; // shrink larger zone
                // mid NOT incremented because swapped element still needs check
            }
        }

        // Low = first pivot index, High = last pivot index
        return new int[] { low, high };
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
