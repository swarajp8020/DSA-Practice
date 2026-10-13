package PREP2025.Practice.Week4Practice;

import java.util.Arrays;

public class p9 {

//    Two Pointers
//
//✔ Move Zeros [2 times peek]
//✔ Remove Duplicates (Sorted) [4 times]
public static void main(String[] args) {
    int[] arr = {1,1,2,2,3,3,4,4};
    int len = removeDuplicates(arr);
    System.out.println(len);
    System.out.println(Arrays.toString(arr));
}
static int removeDuplicates(int[] arr) {
    if (arr.length == 0) return 0;
    int slow = 0;
    for (int fast = 0; fast < arr.length; fast++) {
        if (arr[fast] != arr[slow]) {
            slow++;
            arr[slow] = arr[fast];
        }

        }
    return slow + 1;
    }
}






//public static void main(String[] args) {
//    int[] arr = {1,5,0,62,0,6,2};
//    moveZero(arr);
//    System.out.println(Arrays.toString(arr));
//}
//static void moveZero(int[] arr){
//    int slow = 0;
//    for (int fast = 0; fast < arr.length; fast++) {
//        if (arr[fast] != 0){
//            int temp = arr[slow];
//            arr[slow] = arr[fast];
//            arr[fast] = temp;
//            slow++;
//        }
//    }
//}



    //Median using QuickSelect[5,6 times]
//    public static void main(String[] args) {
//        int[] arr = {34,56,23,66,122};
//        medianFinder(arr);
//        System.out.println(medianFinder(arr));
//    }
//    static int medianFinder(int[] arr){
//        int n = arr.length;
//        int mid = n/2;
//        if (n%2!=0){
//            return quickSelect(arr, 0 ,n-1, mid);
//        } else {
//            int a = quickSelect(arr, 0 ,n-1, mid);
//            int b = quickSelect(arr, 0 ,n-1, mid-1);
//            return (a+b)/2;
//        }
//
//    }
//
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        int pivotIndex = partitionLomuto(arr, left, right);
//        if (pivotIndex == targetIndex) return arr[pivotIndex];
//        if (pivotIndex < targetIndex) return quickSelect(arr, pivotIndex+1, right, targetIndex);
//        return quickSelect(arr, left, pivotIndex-1, targetIndex);
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i =left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr,i,j);
//            }
//        }
//        swap(arr,i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

    //Top-K Smallest
//    public static void main(String[] args) {
//        int[] arr = {34,56,23,66,122};
//        int k = 1;
//        int[] res = topKSmallest(arr, k);
//        System.out.println(Arrays.toString(res));
//    }
//    static int[] topKSmallest(int[] arr, int k){
//        int n = arr.length;
//        int targetIndex = k-1;
//        quickSelect(arr, 0, n -1, targetIndex);
//        return Arrays.copyOfRange(arr, 0, k);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        int pivotIndex = partitionLomuto(arr, left, right);
//        if (pivotIndex == targetIndex) return arr[pivotIndex];
//        if (pivotIndex < targetIndex) return quickSelect(arr, pivotIndex+1, right, targetIndex);
//        return quickSelect(arr, left, pivotIndex-1, targetIndex);
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i =left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr,i,j);
//            }
//        }
//        swap(arr,i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

    //Top-K Largest [peek 3 times]
//    public static void main(String[] args) {
//        int[] arr = {34,56,23,66,122};
//        int k = 2;
//        int[] res = topKLargest(arr, k);
//        System.out.println(Arrays.toString(res));
//    }
//    static int[] topKLargest(int[] arr, int k){
//        int n = arr.length;
//        int targetIndex = n-k;
//        quickSelect(arr, 0, n -1, targetIndex);
//        return Arrays.copyOfRange(arr, targetIndex, n);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        int pivotIndex = partitionLomuto(arr, left, right);
//        if (pivotIndex == targetIndex) return arr[pivotIndex];
//        if (pivotIndex < targetIndex) return quickSelect(arr, pivotIndex+1, right, targetIndex);
//        return quickSelect(arr, left, pivotIndex-1, targetIndex);
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i =left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr,i,j);
//            }
//        }
//        swap(arr,i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
    //kth smallest
//    public static void main(String[] args) {
//        int[] arr = {34,56,23,66,122};
//        int k = 2;
//        int res = quickSelect(arr, 0, arr.length-1, k-1);
//        System.out.println(res);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partition(arr, left, right);
//            if (pivotIndex == targetIndex) return arr[pivotIndex];
//            if (pivotIndex < targetIndex) return quickSelect(arr, pivotIndex+1, right, targetIndex);
//            return quickSelect(arr, left,pivotIndex-1, targetIndex);
//        }
//        return -1;
//    }
//    static int partition(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i, j);
//            }
//        }
//        swap(arr, i+1, right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
    //kth largest [2 time peek]
//    public static void main(String[] args) {
//        int[] arr = {34,56,23,66,122};
//        int k = 1;
//        int res = quickSelect(arr, 0, arr.length-1, arr.length-k);
//        System.out.println(res);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partition(arr, left, right);
//            if (pivotIndex == targetIndex) return arr[pivotIndex];
//            if (pivotIndex < targetIndex) return quickSelect(arr, pivotIndex+1, right, targetIndex);
//            return quickSelect(arr, left,pivotIndex-1, targetIndex);
//        }
//        return -1;
//    }
//    static int partition(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i = left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i, j);
//            }
//        }
//        swap(arr, i+1, right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
//}
