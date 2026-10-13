package PREP2025.recapImpTopics.sorting;

public class medianFinder {
    static void main(String[] args) {
        int[] arr1 = {45,23,26,231,67};
        int[] arr2 = {45,23,26,231};

        System.out.println(medianFinder(arr1));
        System.out.println(medianFinder(arr2));
    }
    static int medianFinder(int[] arr){
        int n = arr.length;
        int mid = n / 2;
        if (n % 2 != 0) {
            return quickSelect(arr, 0, n - 1, mid);
        } else {
            int a = quickSelect(arr, 0, n - 1, mid);
            int b = quickSelect(arr, 0, n-1, mid-1);
            return (a+b)/2;
        }
    }
    static int quickSelect(int[] arr, int left, int right, int targetIndex){
        if (left <= right) {
            int pivotIndex = partition(arr, left, right);
            if (pivotIndex == targetIndex) {
                return arr[pivotIndex];
            }
            if (pivotIndex < targetIndex){
                return quickSelect(arr, pivotIndex + 1, right, targetIndex);
            }
        return quickSelect(arr, left, pivotIndex - 1, targetIndex);
        }
        return -1;
    }
    static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
