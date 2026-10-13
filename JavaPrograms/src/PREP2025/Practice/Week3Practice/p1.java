package Week3Practice;

import java.util.Arrays;

//Problem 1 — Insert an element into a partially sorted array
//The left side is sorted, the last element is unsorted.
//Input:
//[2, 4, 6, 8, 3]
//Output:
//[2, 3, 4, 6, 8]
//🧠 Hint:
//This is literally one step of insertion sort.

public class p1 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 3};
        insertLast(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertLast(int[] arr) {
        int n = arr.length;
        int key = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;
    }
}
