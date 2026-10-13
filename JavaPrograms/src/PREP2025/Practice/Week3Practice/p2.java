package Week3Practice;

import java.util.Arrays;

//Problem 2 — Sort the entire array using insertion sort
//
//Straightforward.
//
//Input:
//[6, 2, 4, 5, 1]
//Output:
//[1, 2, 4, 5, 6]


public class p2 {
    public static void main(String[] args) {
        int[] arr = {6, 2, 4, 5, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {  // FIXED
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // shift right
                j--;
            }

            arr[j + 1] = key;   // insert key in correct place
        }
    }
}
