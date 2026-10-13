package PREP2025.binarySearch;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {3,13,45,23,44};
        int target = 23;
        Arrays.sort(arr);
        System.out.println("Sorted Arrays: "+ Arrays.toString(arr));
        int result = search(arr, target);
        if (result == -1){
            System.out.println("not found");
        } else {
            System.out.println("Found "+result);
        }
    }
    static int search(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while (left<=right) {
            int mid = (right + left) / 2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                left = mid+1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }

}
