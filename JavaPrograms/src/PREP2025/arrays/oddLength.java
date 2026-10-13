package PREP2025.arrays;

import java.util.Arrays;

public class oddLength {
    void oddLengthArray(int[] arr){
        for (int left = 0, right=arr.length-1; left < right; left++, right--) {
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        oddLength oddLength = new oddLength();
        oddLength.oddLengthArray(arr);
        System.out.println("Odd Length Arrays: "+ Arrays.toString(arr));
    }
}
