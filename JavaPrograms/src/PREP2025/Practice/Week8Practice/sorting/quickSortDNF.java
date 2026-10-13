package PREP2025.Practice.Week8Practice.sorting;

import java.util.Arrays;

public class quickSortDNF {
    static void main(String[] args) {
        int[] arr = {7,5,1,8,0,2,-1,4,1};
        quickSortDNF(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSortDNF(int[] arr, int left, int right){
        if (left>=right) return;
        int[] bounds = partition(arr, left, right);
        int low = bounds[0];
        int high = bounds[1];
        quickSortDNF(arr, left, low-1);
        quickSortDNF(arr, high+1, right);
    }
    static int[] partition(int[] arr, int left, int right){
        int pivot = arr[left+(right-left)/2];
        int low = left, mid = left, high = right;
        while (mid <= high) {
            if (arr[mid] < pivot) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == pivot) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        return new int[]{low, high};
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
