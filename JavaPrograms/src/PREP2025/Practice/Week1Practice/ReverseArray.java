package Week1Practice;

import java.util.Arrays;

public class ReverseArray {
    static void revArray(int[] arr){
        int left =0, right =arr.length-1;
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        revArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
