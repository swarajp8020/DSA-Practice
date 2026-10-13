package PREP2025.Practice.WeekdayPractice;

import java.util.Arrays;

public class qSortDNF {
    public static void main(String[] args) {
        int[] arr = {9,5,2,1,0,-4,9};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int left, int right){
        if (left>=right)return;
        int[] bound = dnfPartition(arr, left,right);
        int low = bound[0];
        int high = bound[1];

        quickSort(arr, left, low-1);
        quickSort(arr, high+1, right);
    }
    static int[] dnfPartition(int[] arr, int left, int right){
        int pivot = arr[(right+left)/2];
        int low = left;
        int mid = left;
        int high = right;

        while (mid<=high){
            if (arr[mid]<pivot){
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
