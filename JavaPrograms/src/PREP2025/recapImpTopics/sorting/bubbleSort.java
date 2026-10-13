package PREP2025.recapImpTopics.sorting;

import java.util.Arrays;
/// Time: O(n²)
/// Space: O(1)
/// Stable: Insertion, Bubble
/// Use case: nearly sorted PREP2025.arrays → insertion
/// Interview line:
/// “These are basic comparison sorts, mainly useful for understanding mechanics or small / nearly sorted inputs.”
public class bubbleSort {
    static void main(String[] args) {
        int[] arr = {3,4,5,68,32,23};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
