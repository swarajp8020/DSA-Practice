package PREP2025.Practice.WeekdayPractice;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {6,2,4,5,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>key){
                arr[j+1]= arr[j] ;
                j--;
            }
            arr[j+1]=key;
        }
    }
}
