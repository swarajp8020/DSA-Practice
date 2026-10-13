package PREP2025.stage1;

public class MaxNumInRange {
    public static void main(String[] args) {
        int[] arr = {1,3,54,6,7};
        System.out.println(maxRange(arr, 0, 0));
    }

     static int maxRange(int[] arr, int start, int end) {
         if(arr == null){
             return -1;
         }
         if(start<end){
             return -1;
         }

        int maxValue = arr[start];
         if (arr.length == 0){
             return -1;
         }

         for (int i = start; i < end; i++) {
             if (arr[i]>maxValue){
                 maxValue =arr[i];
             }
         }
         return maxValue;
    }
}
