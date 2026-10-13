package PREP2025.sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr ={2,4,1,5,23};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        for (int n: arr){
            System.out.println(n);
        }
    }
    // Insertion Sort
    static void insertionSort(int[] arr) {

        // Start from arr[1] because arr[0] is already sorted alone
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i]; // number to insert
            int j = i - 1;    // pointer to sorted left side

            // Shift bigger numbers to right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key where it belongs
            arr[j + 1] = key;
        }
    }

}
