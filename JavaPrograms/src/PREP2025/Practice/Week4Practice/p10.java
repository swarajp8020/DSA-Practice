package PREP2025.Practice.Week4Practice;

//QuickSelect + MoveZeros + RemoveDuplicates
public class p10 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,4,65,1};
        int k=3;
        int res = quickSelect(arr, 0, arr.length-1, k-1);
        System.out.println(res);;
    }
    static int quickSelect(int[] arr, int left, int right, int targetIndex){
        if (left<=right){
            int pivotIndex = partitionLomuto(arr, left, right);
            if (pivotIndex == targetIndex) return arr[pivotIndex];
            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right, targetIndex);
            return quickSelect(arr, left, pivotIndex-1, targetIndex);
        }
        return -1;
    }
    static int partitionLomuto(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if (arr[j] <=pivot){
                i++;
                swap(arr,i,j);
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

//RemoveDuplicates
//    public static void main(String[] args) {
//        int[] arr = {1,1,0,0,1,2,2,4,0,1,5};
//        int res = removeDuplicates(arr);
//        System.out.println(res);
//        System.out.println(Arrays.toString(arr));
//    }
//    static int removeDuplicates(int[] arr){
//        if (arr.length==0) return 0;
//        int slow= 0;
//        for (int fast = 0; fast < arr.length; fast++) {
//            if (arr[fast] != arr[slow]){
//                slow++;
//                arr[slow] = arr[fast];
//            }
//        }
//        return slow+1;
//    }

//MoveZeros
//    public static void main(String[] args) {
//        int[] arr = {1,0,1,2,4,0,1,5};
//        moveZeros(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void moveZeros(int[] arr){
//        int slow= 0;
//        for (int fast = 0; fast < arr.length; fast++) {
//            if (arr[fast] != 0){
//                int temp = arr[slow];
//                arr[slow] = arr[fast];
//                arr[fast] = temp;
//                slow++;
//            }
//        }
//    }
}
