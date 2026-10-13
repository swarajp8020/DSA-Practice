package PREP2025.Practice.WeekdayPractice;

import java.util.Arrays;

public class problems {
    //reverse the array, swap elements from both ends moving toward the center until all elements are reversed in place.
    static void reverseArray(int[]arr){
        int left = 0, right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

}
