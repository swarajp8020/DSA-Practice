package PREP2025.Practice.WeekdayPractice;

import java.util.Arrays;

public class bbSort {
    public static void main(String[] args) {
        int[] arr = {24,55,22,5,1,35};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        for(int n:arr){
            System.out.println(n);
        }

    }
    static void bubbleSort(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
