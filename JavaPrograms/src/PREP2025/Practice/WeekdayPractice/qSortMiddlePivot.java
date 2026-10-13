package PREP2025.Practice.WeekdayPractice;

import java.util.Arrays;

public class qSortMiddlePivot {
    public static void main(String[] args) {
        int[] arr = {7,5,1,8,0,2, -1,4,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int left, int right){
        if (left>= right) return;
        int pivotIndex = partition(arr, left, right);
        quickSort(arr, left, pivotIndex);
        quickSort(arr, pivotIndex+1, right);
    }
    static int partition(int[] arr, int left, int right){
        int pivot = arr[(right+left)/2];
        while (true){
            while (arr[left]<pivot)  left++;
            while (arr[right]>pivot)  right--;
            if (left>=right) return right;

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
