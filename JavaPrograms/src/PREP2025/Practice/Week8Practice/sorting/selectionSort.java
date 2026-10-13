package PREP2025.Practice.Week8Practice.sorting;

import java.util.Arrays;
/// Time: O(n²)
/// Space: O(1)
/// Stable: Insertion, Bubble
/// Use case: nearly sorted PREP2025.arrays → insertion
/// Interview line:
/// “These are basic comparison sorts, mainly useful for understanding mechanics or small / nearly sorted inputs.”
public class selectionSort {
    static void main(String[] args) {
        int[] arr={11,3,45,23,10,5,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
