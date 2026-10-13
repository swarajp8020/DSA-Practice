package PREP2025.recapImpTopics.sorting;

import java.util.Arrays;

public class TopKLargest {
    static void main(String[] args) {
        int[] arr = {54,2,3,5,6,22};
        int k =5;
        int[] result = topKLargest(arr,k);
        System.out.println(Arrays.toString(result));
    }
    static int[] topKLargest(int[] arr, int k){
        int n = arr.length;
        int targetIndex = n - k;
        quickSelect(arr, 0, n-1, targetIndex);
        return Arrays.copyOfRange(arr, targetIndex, n);
    }
    static int quickSelect(int[] arr, int left, int right, int targetIndex){
        if (left <= right) {
            int pivotIndex = partition(arr, left, right);
            if (pivotIndex == targetIndex) {
                return arr[pivotIndex];
            }
            if (pivotIndex < targetIndex) {
                return quickSelect(arr, pivotIndex + 1, right, targetIndex);
            }
        return quickSelect(arr, left, pivotIndex - 1, targetIndex);
        }
        return -1;
    }
    static int partition(int[] arr, int left, int right){
        int randomIndex = (int) (Math.random()*(right - left + 1));
        swap(arr, randomIndex, randomIndex);
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
