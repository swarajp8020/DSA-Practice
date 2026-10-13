package PREP2025.Practice.WeekdayPractice;

import java.util.Arrays;

public class quickSortRandom {
    public static void main(String[] args) {
        int[] arr = {6,4,2,1,0,-5,3};
        quickSortRandom(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSortRandom(int[] arr, int left, int right){
        if (left>=right)return;

        int random = left + (int)(Math.random() * (right-left+1));
        swap(arr, random, right);

        int pivotIndex = partition(arr, left,right);
        quickSortRandom(arr, left, pivotIndex-1);
        quickSortRandom(arr, pivotIndex+1, right);
    }
    static int partition(int[]arr, int left, int right){
        int pivot = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if (arr[j]<pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[ b];
        arr[b] = temp;
    }

}
