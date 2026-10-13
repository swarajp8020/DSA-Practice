package Week4Practice;

import java.util.Arrays;

public class p1 {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        quickSortDNF1(arr, 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSortDNF1(int[] arr, int left, int right){
        if (left>= right)return;
        int[] found = partitionDNF1(arr, left,right);
        int low = found[0];
        int high = found[1];

        quickSortDNF1(arr, left, low-1);
        quickSortDNF1(arr, high+1, right);
    }
    static int[] partitionDNF1(int[] arr, int left, int right){
        int pivot = arr[(right+left)/2];
        int low = left;
        int mid = left;
        int high = right;

        while (mid<=high){
            if (arr[mid]<pivot){
                swap1(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == pivot) {
                mid++;
            } else{
                swap1(arr, mid, high);
                high--;
            }
        }
        return new int[]{low,high};
    }









    //quickSortDNF
    static void quickSortDNF(int[] arr, int left, int right){
        if (left>=right)return;

        int[] found = partitionDNF(arr,left,right);
        int low = found[0];
        int high = found[1];

        quickSortDNF(arr, left, low-1);
        quickSortDNF(arr, high+1, right);
    }
    static int[] partitionDNF(int[] arr, int left, int right){
        int pivot = arr[(left+right)/2];
        int low = left;
        int mid = left;
        int high = right;

        while (mid<=high){
            if (arr[mid]<pivot){
                swap1(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == pivot) {
                mid++;
            } else {
                swap1(arr, high, right);
                high--;
            }
        }

        return new int[]{low, high};
    }
    static void swap1(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //quickSortHoare
    static void quickSortHoare(int[] arr, int left, int right){
        if (left>=right)return;

        int pivotIndex = partitionHoare(arr, left, right);
        quickSortHoare(arr, left, pivotIndex);
        quickSortHoare(arr, pivotIndex+1, right);
    }

    static int partitionHoare(int[] arr, int left, int right){
        int pivot = arr[(left+right)/2];
        while (true){
            while (arr[left]<pivot)left++;
            while (arr[right]>pivot)right--;
            if (left>=right) return right;

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }


    //quickSortLomuto
    static void quickSortLomuto(int[] arr, int left, int right){
        if (left>=right)return;
        int pivotIndex = partitionLomuto(arr,left,right);
        quickSortLomuto(arr,left,pivotIndex-1);
        quickSortLomuto(arr,pivotIndex+1,right);
    }
    static int partitionLomuto(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if (arr[j]<pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr, i+1,right);
        return i+1;
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }





    //mergeSort
    static void mergeSort(int[] arr, int left, int right){
        if (left>= right) return;

        int mid = left+(right-left)/2;
        mergeSort(arr, left,mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }
    static void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while (i<=mid && j<=right){
            if (arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i<=mid)temp[k++] = arr[i++];
        while (j<=right)temp[k++] = arr[j++];

        for (int l = 0; l < temp.length; l++) {
            arr[left+l] = temp[l];
        }
    }
}
