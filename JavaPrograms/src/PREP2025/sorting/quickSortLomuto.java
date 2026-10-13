package PREP2025.sorting;

import java.util.Arrays;
//Lomuto Partition (last pivot)
public class quickSortLomuto {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));;
    }
    static void quickSort(int[] arr, int left, int right){
        if (left>=right){return;}
        int pivotIndex = partition(arr,left,right);
        quickSort(arr,left,pivotIndex-1); // left half
        quickSort(arr,pivotIndex+1, right); // right half
    }
    // Partition splits: < pivot | pivot | > pivot
     static int partition(int[] arr, int left, int right) {
        int pivot = arr[right]; // pick last element
        int i = left -1;       // boundary for smaller elements
         for (int j = left; j < right; j++) {
             if (arr[j]<=pivot){ // item goes left
                 i++;
                 swap(arr,i,j);
             }
         }
         swap(arr,i+1,right); // place pivot in boundary
         return i+1;  // boundary for smaller elements
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }
}
