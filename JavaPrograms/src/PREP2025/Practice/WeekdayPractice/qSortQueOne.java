package PREP2025.Practice.WeekdayPractice;

import java.util.Arrays;

public class qSortQueOne {
//    public static void main(String[] args) {
//        int[] arr = {10, 7, 8, 9, 1, 5};
//        quickSort(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));;
//    }
//    static void quickSort(int[] arr, int left, int right){
//        if (left >= right) return;
//
//        int pivotIndex = partition(arr, left, right);
//        quickSort(arr, left, pivotIndex-1);
//        quickSort(arr, pivotIndex+1,right);
//    }
//    static int partition(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i = left-1;
//
//        for (int j = left; j < right; j++) {
//            if (arr[j]<pivot){
//                i++;
//                swap(arr, i, j);
//            }
//        }
//        swap(arr, i+1,right);
//        return i+1;
//
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

    //QuickSort in Descending Order

//    public static void main(String[] args) {
//        int[] arr = {4, 1, 7, 3, 9};
//        quickSort(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));;
//    }
//    static void quickSort(int[] arr, int left, int right){
//        if (left >= right) return;
//
//        int pivotIndex = partition(arr, left, right);
//        quickSort(arr, left, pivotIndex-1);
//        quickSort(arr, pivotIndex+1,right);
//    }
//    static int partition(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i = left-1;
//
//        for (int j = left; j < right; j++) {
//            if (arr[j]>pivot){
//                i++;
//                swap(arr, i, j);
//            }
//        }
//        swap(arr, i+1,right);
//        return i+1;
//
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

    //QuickSort — Pivot = Middle Element (Medium Level)

        public static void main(String[] args) {
            int[] arr = {4, 1, 7, 3, 9};
            quickSort(arr, 0, arr.length - 1);
            System.out.println(Arrays.toString(arr));
        }

        static void quickSort(int[] arr, int left, int right) {

            int i = left;
            int j = right;
            int pivot = arr[(left + right) / 2];

            while (i <= j) {

                while (arr[i] < pivot) i++;
                while (arr[j] > pivot) j--;

                if (i <= j) {
                    swap(arr, i, j);
                    i++;
                    j--;
                }
            }

            // Now recursively sort the two halves
            if (left < j) quickSort(arr, left, j);
            if (i < right) quickSort(arr, i, right);
        }

        static void swap(int[] arr, int a, int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }

