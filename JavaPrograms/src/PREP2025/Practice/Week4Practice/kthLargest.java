package Week4Practice;

public class kthLargest {
    public static void main(String[] args) {
        int[] arr= {9,23,5,2,42,61};
        int k =2;
        int result = quickSelect(arr, 0, arr.length-1, arr.length-k);
        System.out.println(result);
    }
    static int quickSelect(int[] arr, int left, int right, int targetIndex){
        if (left<=right){
            int pivotIndex = partitionLomuto(arr, left, right);
            if (pivotIndex==targetIndex) return arr[pivotIndex];
            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right, targetIndex);
            return quickSelect(arr, left, pivotIndex-1, targetIndex);
        }
        return -1;
    }
    static int partitionLomuto(int[] arr, int left, int right){
        int pivot = arr[right];
        int i= left-1;
        for (int j = left; j < right; j++) {
            if (arr[j]<=pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
         arr[b] =temp;
    }
}
