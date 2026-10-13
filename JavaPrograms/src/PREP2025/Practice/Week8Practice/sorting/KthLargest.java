package PREP2025.Practice.Week8Practice.sorting;

public class KthLargest {
    static void main(String[] args) {
        int[] arr = {8,5,7,2,9,3};
        int k = 3;
        int res = quickSelect(arr, 0, arr.length-1, arr.length-k);
        System.out.println(res);
    }
    static int quickSelect(int[] arr, int left, int right, int targetIndex){
        if (left <= right) {
            int pivotIndex = partition(arr, left, right);
            if (pivotIndex == targetIndex) {
                return arr[pivotIndex];
            }
            if (pivotIndex < targetIndex)  return quickSelect(arr, pivotIndex + 1, right, targetIndex);
        return quickSelect(arr, left, pivotIndex - 1, targetIndex);
        }
        return -1;
    }

    static int partition(int[] arr, int left, int right){
        //if we add randomIndex then time complexity will reduce from O(n*n) -> O(n)
        int randomIndex= (int) (Math.random()*(right-left+1));
        swap(arr,randomIndex,randomIndex);
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
