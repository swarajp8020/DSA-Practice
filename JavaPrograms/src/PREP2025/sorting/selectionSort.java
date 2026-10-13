package PREP2025.sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={11,3,45,23,10,5,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        for(int n: arr){
            System.out.println(n);
        }

    }
    // Selection Sort
    static void selectionSort(int[] arr) {

        // Move boundary of sorted area (left side)
        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i; // assume current is smallest

            // Explore remaining unsorted area
            for (int j = i + 1; j < arr.length; j++) {

                // Update min when found smaller number
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum to its correct position
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}
