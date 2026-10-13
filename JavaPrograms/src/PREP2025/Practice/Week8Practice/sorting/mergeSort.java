package PREP2025.Practice.Week8Practice.sorting;
import java.util.Arrays;
/// Merge Sort
/// Time: O(n log n)
/// Space: O(n)
/// Stable: Yes
/// Why interviewers like it:
/// Predictable performance
/// Foundation for:
/// Count inversions
/// Merge intervals
/// External PREP2025.sorting
/// Mental model:
/// “Divide, solve, merge. Always balanced.”
public class mergeSort {
    static void main(String[] args) {
        int[] arr = {5, 6, 2, 4, 3};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int left, int right){
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
    static void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else temp[k++] = arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        for (int l = 0; l < temp.length; l++) {
            arr[l+left] = temp[l];
        }
    }
}
