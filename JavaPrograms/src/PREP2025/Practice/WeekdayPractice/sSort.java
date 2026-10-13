package PREP2025.Practice.WeekdayPractice;

import java.util.Arrays;

public class sSort {
    public static void main(String[] args) {
        int[] arr = {2,5,6,1,3,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        for(int n:arr){
            System.out.println(n);
        }
    }
    static void selectionSort(int[] arr){
        int n= arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (arr[j]<arr[minIndex]){
                    minIndex =j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
