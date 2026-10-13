package Week3Practice;

import java.util.Arrays;

//Problem 3 — Count number of shifts during insertion sort
//
//Count how many total shifts happen inside the while loop.
//
//Example:
//Input: [2, 1, 3, 1, 2]
//Output: 4 shifts
//
//🧠 Every time you do:
//
//arr[j+1] = arr[j];
//
//
//count++;
public class p3 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 1, 2};

        int shifts = insertionSort(arr);   // ← store the returned count

        System.out.println("Sorted: " + Arrays.toString(arr));
        System.out.println("Shifts: " + shifts);   // ← print it
    }

    static int insertionSort(int[] arr){
        int n = arr.length;
        int count = 0;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                count++;           // count shift
            }

            arr[j + 1] = key;
        }

        return count;             // return shifts
    }
}
