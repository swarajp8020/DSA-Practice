package PREP2025.binarySearch;

import java.util.Arrays;

public class binarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {3, 13, 45, 23, 44};
        Arrays.sort(arr);
        int target = 23;
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        int result = search(arr, 0, arr.length - 1, target);
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found " + target + " at index: " + result);
        }
    }
    static int search(int[] arr, int left, int right, int target) {
        if (left > right) { // Base case: nothing left to search
            return -1;
        }

        int mid = left + (right - left) / 2;
        System.out.println("Left: " + left + ", Mid: " + mid + ", Right: " + right + " → Checking " + arr[mid]);

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            // Search left half
            return search(arr, left, mid - 1, target);
        } else {
            // Search right half
            return search(arr, mid + 1, right, target);
        }
    }
}
