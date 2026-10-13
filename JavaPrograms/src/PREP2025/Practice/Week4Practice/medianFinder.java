package Week4Practice;

public class medianFinder {
    public static void main(String[] args) {
        int[] arr1 = {56,23,57,13,234};
        int[] arr2 = {56,57,13,234};
        System.out.println(findMedian(arr1));
        System.out.println(findMedian(arr2));
    }
    static int findMedian(int[] arr){
        int n = arr.length;
        int mid = n/2;

        if (n%2 != 0){
            return quickSelect(arr, 0, n-1, mid);
        } else {
            int a=  quickSelect(arr, 0, n-1, mid);
            int b =  quickSelect(arr, 0, n-1, mid-1);
            return (a+b)/2;
        }
    }
    static int quickSelect(int[] arr, int left, int right, int targetIndex){
        if (left<=right){
            int pivotIndex = partitionLomuto(arr, left,right);
            if (pivotIndex == targetIndex) return arr[pivotIndex];
            if (pivotIndex<targetIndex) return quickSelect(arr,  pivotIndex+1, right,targetIndex);
            return quickSelect(arr, left, pivotIndex-1, targetIndex);
        }
        return -1;
    }
    static int partitionLomuto(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if (arr[j]<=pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr, i+1,right);
        return i+1;
    }
    static void swap(int[] arr, int a, int b){
        int temp =arr[a];
        arr[a] = arr[b];
         arr[b] = temp;
    }
}
