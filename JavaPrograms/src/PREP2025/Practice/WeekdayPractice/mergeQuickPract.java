package PREP2025.Practice.WeekdayPractice;

import java.util.Arrays;

public class mergeQuickPract {
    public static void main(String[] args) {
        int[] arr = {6,7,3,4,2};
//        mergeSort(arr, 0, arr.length-1);
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //Quick Sort
    static void quickSort(int[] arr, int left, int right){
        if (left>= right)return;
        int pivotIndex = partition(arr, left, right);
        quickSort(arr, left, pivotIndex-1);
        quickSort(arr, pivotIndex+1, right);
    }
    static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left-1;

        for (int j = left; j < right; j++) {
            if (arr[j]<pivot){
                i++;
                swap(arr, i ,j);
            }
        }
        swap(arr, i+1 ,right);
        return i+1;
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    //Merge Sort
    static void mergeSort(int[] arr, int left, int right){
        if (left>=right)return;
        int mid = left + (right-left)/2;
        mergeSort(arr, left,mid);
        mergeSort(arr, mid+1,right);
        merge(arr, left, mid, right);
    }
    static void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;

        while (i<=mid && j<= right){
            if (arr[i]<arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i<=mid){
            temp[k++] = arr[i++];
        }
        while (j<=right){
            temp[k++] = arr[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            arr[left+l] = temp[l];
        }
    }
}
