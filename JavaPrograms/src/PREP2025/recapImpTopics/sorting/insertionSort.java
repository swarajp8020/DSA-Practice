package PREP2025.recapImpTopics.sorting;

import java.util.Arrays;
/// Time: O(n²)
/// Space: O(1)
/// Stable: Insertion, Bubble
/// Use case: nearly sorted PREP2025.arrays → insertion
/// Interview line:
/// “These are basic comparison sorts, mainly useful for understanding mechanics or small / nearly sorted inputs.”
public class insertionSort {
    static void main(String[] args) {
        int[] arr ={2,4,1,5,23};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
