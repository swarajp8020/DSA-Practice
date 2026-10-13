package Week4Practice;

import java.util.Arrays;

public class p4 {
    //MedianSort
    public static void main(String[] args) {
        int[] arr = {6,2,4,7,2,1,8};
        quickSortMedian(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSortMedian(int[] arr, int left, int right){
        if (left>=right)return;
        int medianIndex = medianPartition(arr, left,right);
        swap(arr, medianIndex, right);

        int pivotIndex = partitionLomuto(arr, left, right);
        quickSortMedian(arr, left, pivotIndex-1);
        quickSortMedian(arr, pivotIndex+1, right);
    }
    static int medianPartition(int[] arr, int left, int right){
        int mid = left + (right-left)/2;
        if (arr[left]>arr[mid]) swap(arr,left,mid);
        if (arr[mid]>arr[right]) swap(arr,mid,right);
        if (arr[left]>arr[mid]) swap(arr,left,mid);

        return mid;
    }

    static int partitionLomuto(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if (arr[j]<=pivot){
                i++;
                swap(arr,i,j);
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
