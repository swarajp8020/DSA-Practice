package PREP2025.binarySearch;

import java.util.Arrays;

public class binarySearchRec {
    public static void main(String[] args) {
        int[] arr = {6,2,56,7,4};
        int target = 4;
        Arrays.sort(arr);
        System.out.println("Sorted Arrays: "+ Arrays.toString(arr));
        int result = search(arr, 0, arr.length-1, target);
        if (result == -1){
            System.out.println("Not found");
        } else {
            System.out.println("Found "+ result);
        }
    }
    static int search(int[] arr, int left, int right,  int target){
        int mid = (left+right)/2;
        if (left>right){
            return -1;
        }
        if (arr[mid]==target){
            return mid;
        } if (arr[mid]> target){
            return search(arr, left, mid-1,target);
        } else {
            return search(arr,mid+1,right,target );
        }
    }
}
