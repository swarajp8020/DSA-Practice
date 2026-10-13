package PREP2025.Practice.Week8Practice.sorting;

public class countInversions {
    static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int result = mergeSort(arr, 0, arr.length - 1);
        System.out.println("Inversions: " + result);
    }
    static int mergeSort(int[] arr, int left, int right){
        if (left >= right)return 0;
        int mid = left + (right-left)/2;
        int leftCount = mergeSort(arr, left, mid);
        int rightCount = mergeSort(arr, mid+1, right);
        int mergeCount = merge(arr, left, mid, right);
        return leftCount + rightCount + mergeCount;
    }
    static int merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        int inversions = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                // All remaining on left side are > arr[j]
                inversions += (mid - i + 1);
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, left, temp.length);
        return inversions;
    }
}
