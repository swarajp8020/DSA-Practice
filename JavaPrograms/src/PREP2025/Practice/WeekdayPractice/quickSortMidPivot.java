package PREP2025.Practice.WeekdayPractice;

import java.util.Arrays;

public class quickSortMidPivot {
    public static void main(String[] args) {
        int[] arr = {7,5,1,8,0,2, -1,4,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int left, int right){
        if (left>=right)return;
        int[] bounds = dnfPartition(arr, left,right);
        int low = bounds[0];
        int high = bounds[1];

        quickSort(arr, left, low-1);
        quickSort(arr, high+1, right);
    }
    static int[] dnfPartition(int[]arr, int left, int right){
        int pivot = arr[(left+right)/2];
        int low = left;
        int mid = left;
        int high = right;

        while (mid<=high){
            if (arr[mid]<pivot){
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == pivot){
                mid++;
            } else {
                swap(arr, mid,right);
                high--;
            }
        }
        return new int[]{low-1, high+1};
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    static int partition(int[] arr, int left, int right){
        int pivot = arr[(left+right)/2];
        while (true){
            while (arr[left]<pivot) left++;
            while (arr[right]> pivot) right--;

            if(left>=right) return right;

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] =temp;

            left++;
            right--;
        }
    }
}
