package PREP2025.arrays;

import java.util.Arrays;

public class reverseArray {
    void reverseArrays(int[] arr){
//        int left =0, right=arr.length-1;
//        while (left < right){
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//        for (int left = 0, right= arr.length-1; left < right; left++, right--) {
//            int temp = arr[left];
//            arr[left]=arr[right];
//            arr[right]=temp;
//        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverseArray array =new reverseArray();
        array.reverseArrays(arr);
        System.out.println("Reverse Arrays :"+ Arrays.toString(arr));
    }
}
