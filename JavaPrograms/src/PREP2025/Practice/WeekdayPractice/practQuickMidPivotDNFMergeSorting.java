package PREP2025.Practice.WeekdayPractice;

import java.util.Arrays;

public class practQuickMidPivotDNFMergeSorting {
    public static void main(String[] args) {
        int[] arr = {6,2,4,5,1,3};
//        mergeSort(arr, 0, arr.length-1);
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int left, int right){
        if (left>=right)return;
        int[] bound = DNFPartition(arr,left,right);
        int low = bound[0];
        int high = bound[1];

        quickSort(arr, left, low-1);
        quickSort(arr, high+1, right);
    }
    static int[] DNFPartition(int[] arr, int left, int right){
        int pivot = arr[(left+right)/2];
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

    //Quick Sort Mid Pivot
//    static void quickSort(int[] arr, int left, int right){
//        if (left>= right)return;
//        int pivotIndex = partition(arr,left,right);
//        quickSort(arr, left, pivotIndex);
//        quickSort(arr, pivotIndex+1, right);
//    }
//    static int partition(int[] arr, int left, int right){
//        int pivot = arr[(right+left)/2];
//
//        while (true){
//            while (arr[left]<pivot){ left++;}
//            while (arr[right]>pivot) right--;
//
//            while (left>=right)return right;
//
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//    }



    //mergesort
    static void mergeSort(int[] arr, int left, int right){
        if (left>= right)return;
        int mid = left+(right-left)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left,mid,right);
    }
    static void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while (i<=mid && j<=right){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i<=mid){temp[k++] = arr[i++];}
        while (j<=right){temp[k++] = arr[j++];}

        for (int l = 0; l <temp.length ; l++) {
            arr[left+l] = temp[l];
        }
    }
}
