package Week4Practice;

import java.util.Arrays;

public class p8 {

    public static void main(String[] args) {
        int[] arr = {12,4,5,2,13,52};
        int k = 3;
        int[] result = topKSmallest(arr,k);
        System.out.println(Arrays.toString(result));
    }
//    kth smallest

    static int[] topKSmallest(int[] arr, int  k){
        int n = arr.length;
        int targetIndex = k-1;
        quickSelect1(arr, 0, n-1,targetIndex);
        return Arrays.copyOfRange(arr, 0, k);
    }
    static int quickSelect1(int[] arr, int left, int right, int targetIndex){
        if (left<=right){
            int pivotIndex = partitionLomuto1(arr, left,right);
            if (pivotIndex==targetIndex) return arr[pivotIndex];
            if (pivotIndex<targetIndex) quickSelect1(arr, pivotIndex+1, right, targetIndex);
            return quickSelect1(arr, left,pivotIndex-1, targetIndex);
        }
        return -1;
    }
    static int partitionLomuto1(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left-1;
        for (int j = left; j < right ; j++) {
            if (arr[j]<=pivot){
                i++;
                swap1(arr, i, j);
            }
        }
        swap1(arr, i+1, right);
        return i+1;
    }
    static void swap1(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }



    //kth largest
    static int[] topKLargest(int[] arr, int k){
        int n = arr.length;
        int targetIndex = n-k;

        quickSelect(arr, 0, n-1, targetIndex);
        return Arrays.copyOfRange(arr, targetIndex, n);

    }
    static int quickSelect(int[] arr, int left, int right, int targetIndex){
        if (left<=right){
            int pivotIndex = partitionLomuto(arr, left,right);
            if (pivotIndex==targetIndex) return arr[pivotIndex];
            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right, targetIndex);
            return quickSelect(arr, left, pivotIndex-1, targetIndex);
        }
        return -1;
    }
    static int partitionLomuto(int[] arr, int left, int right){
        int  pivot = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if (arr[j]<=pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] =temp;
    }
}
